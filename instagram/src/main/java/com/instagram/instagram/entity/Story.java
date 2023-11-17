package com.instagram.instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stories")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private int sid;

    @Column(name = "content")
    private String content;

    @Column(name = "belongs_to")
    private int belongsTo;

    @Column(name = "liked_by")
    private String likedBy;
    
    @Column(name = "view_by")
    private String viewBy;

    public Story(String content, int belongsTo, String likedBy, String viewBy) {
        this.content = content;
        this.belongsTo = belongsTo;
        this.likedBy = likedBy;
        this.viewBy = viewBy;
    }

    public int getSid() {
        return sid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(int belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(String likedBy) {
        this.likedBy = likedBy;
    }

    public String getViewBy() {
        return viewBy;
    }

    public void setViewBy(String viewBy) {
        this.viewBy = viewBy;
    }

    public Story() {
        // empty constructor
    }

    
}
