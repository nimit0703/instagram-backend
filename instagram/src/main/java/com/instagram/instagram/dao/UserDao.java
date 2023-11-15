package com.instagram.instagram.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagram.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    // define additional methods here if needed
    public List<User> findByEmail(String email);
}
