package com.instagram.instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int cid;

    @Column(name = "user")
    private int user;

    @Column(name = "post")
    private int post;

    @Column(name = "text")
    private String text;

    @Column(name = "likes")
    private String likes;

    @Column(name = "threads")
    private String threads;

    public Comment() {

    }

    public Comment(int belongsTo, String text, String likes, String threads, int post) {
        this.user = belongsTo;
        this.text = text;
        this.likes = likes;
        this.threads = threads;
        this.post = post;
    }

    public int getCid() {
        return cid;
    }

    public int getUser() {
        return user;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public void setUser(int belongsTo) {
        this.user = belongsTo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }
}
