package com.instagram.instagram.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.instagram.dao.PostDao;
import com.instagram.instagram.entity.Post;

@RestController
@RequestMapping("/api/post")
public class PostRestController {
    private final PostDao postDao;
    
    @Autowired
    public PostRestController(PostDao thisPostDao){
        postDao = thisPostDao;
    }

    @GetMapping("/all")
     public ResponseEntity<List<Post>> findAllUsers() {
        try {
            List<Post> posts = postDao.findAll();
            return new ResponseEntity<>(posts, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    } 

    @GetMapping("/byUid/{uid}")
    public ResponseEntity<List<Post>> findPostsByUid(@PathVariable int uid){
        try{
            List<Post> posts = postDao.findByBelongsTo(uid);
            return new ResponseEntity<>(posts,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
