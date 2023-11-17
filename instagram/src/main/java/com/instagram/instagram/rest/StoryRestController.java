package com.instagram.instagram.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.instagram.dao.StoryDao;
import com.instagram.instagram.entity.Story;

@RestController
@RequestMapping("/api/story")
public class StoryRestController {

    private final StoryDao storyDao;
    @Autowired
    public StoryRestController(StoryDao thisStoryDao) {
        storyDao = thisStoryDao;
    }

   @GetMapping("/{id}")
    public ResponseEntity<Story> findUserById(@PathVariable Long id) {
        try {
            Optional<Story> story = storyDao.findById(id);
            return story.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byUid/{uid}")
    public ResponseEntity<List<Story>> findStoriesByUid(@PathVariable int uid) {
        List<Story> stories = storyDao.findByBelongsTo(uid);

        if (stories != null) {
            return new ResponseEntity<>(stories, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
