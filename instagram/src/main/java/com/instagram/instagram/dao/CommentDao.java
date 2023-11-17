package com.instagram.instagram.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagram.entity.Comment;

@Repository
public interface CommentDao extends JpaRepository<Comment, Long> {

    List<Comment> findByPost(int post);

}
