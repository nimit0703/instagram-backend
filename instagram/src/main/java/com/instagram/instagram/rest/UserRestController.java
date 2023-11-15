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

import com.instagram.instagram.dao.UserDao;
import com.instagram.instagram.entity.User;

@RestController
@RequestMapping("/api/user")
public class UserRestController {

    private final UserDao userDao;

    @Autowired
    public UserRestController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/allUser")
    public ResponseEntity<List<User>> findAllUsers() {
        try {
            List<User> users = userDao.findAll();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        try {
            Optional<User> user = userDao.findById(id);
            return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byEmail/{email}")
    public ResponseEntity<List<User>> findUsersByEmail(@PathVariable String email) {
        try {
            List<User> users = userDao.findByEmail(email);
            if (!users.isEmpty()) {
                return new ResponseEntity<>(users, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
