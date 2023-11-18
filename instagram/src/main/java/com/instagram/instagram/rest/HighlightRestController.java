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

import com.instagram.instagram.dao.HighlightDao;
import com.instagram.instagram.entity.Highlight;

@RestController
@RequestMapping("/api/hl")
public class HighlightRestController {

    private final HighlightDao hlDao;

    @Autowired
    public HighlightRestController(HighlightDao hld) {
        hlDao = hld;
    }

    @GetMapping("/{id}")
    public Optional<Highlight> findHlById(@PathVariable Long id) {
        Optional<Highlight> highlight = hlDao.findById(id);
        return highlight;
    }

    @GetMapping("/byUid/{uid}")
    public ResponseEntity<List<Highlight>> findHlsByUid(@PathVariable int uid) {
        try {
            List<Highlight> hls = hlDao.findByBelongsTo(uid);
            return new ResponseEntity<>(hls, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
