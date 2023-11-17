package com.instagram.instagram.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.instagram.dao.CommentDao;
import com.instagram.instagram.entity.Comment;

@RestController
@RequestMapping("/api/comment")
public class CommentRestController {
    private final CommentDao commentDao;

    @Autowired
    public CommentRestController(CommentDao thisCommentDao) {
        commentDao = thisCommentDao;
    }

    @GetMapping("post/{id}")
    public ResponseEntity<List<Comment>> findCommentsByPost(@PathVariable int id) {
        try {
            List<Comment> comments = commentDao.findByPost(id);
            return new ResponseEntity<>(comments, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
