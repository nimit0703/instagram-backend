package com.instagram.instagram.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.instagram.entity.Highlight;

@Repository
public interface HighlightDao extends JpaRepository<Highlight,Long> {

    List<Highlight> findByBelongsTo(int uid);

    // List<Highlight> findAllById(Long id);
    
}
