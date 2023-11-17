package com.instagram.instagram.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagram.entity.Story;

@Repository
public interface StoryDao extends JpaRepository<Story, Long> {

    // define additional methods here if needed
    public Optional<Story> findBySid(Long sid);

    public List<Story> findByBelongsTo(int uid);
}