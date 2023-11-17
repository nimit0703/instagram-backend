package com.instagram.instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pid")
    private int pid;

    @Column(name = "img")
    private String img;

    @Column(name = "belongs_to")
    private int belongsTo;

    @Column(name = "likes")
    private String likes;

    @Column(name = "comments")
    private String comments;

    @Column(name = "caption")
    private String caption;

    public Post() {

    }

    public Post(String img, int belongsTo, String likes, String comments, String caption) {
        this.img = img;
        this.belongsTo = belongsTo;
        this.likes = likes;
        this.comments = comments;
        this.caption = caption;
    }

    public int getPid() {
        return pid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(int belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

}
