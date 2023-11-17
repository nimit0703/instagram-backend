package com.instagram.instagram.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagram.entity.Post;

@Repository
public interface PostDao  extends JpaRepository<Post,Long>{

    List<Post> findByBelongsTo(int uid);
    
}
