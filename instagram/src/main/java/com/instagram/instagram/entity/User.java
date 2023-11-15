package com.instagram.instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private int uid;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "name")
    private String name;

    @Column(name = "theme")
    private String theme;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "profile_img")
    private String profileImg;

    @Column(name = "following")
    private String following;

    @Column(name = "followers")
    private String followers;

    @Column(name = "stories")
    private String stories;

    @Column(name = "has_stories")
    private String hasStories;

    @Column(name = "highlights")
    private String highlights;

    public User() {

    }

    // constructor
    public User(String userName, String name, String theme, String email, String password, String profileImg,
            String following, String followers, String stories, String hasStories, String highlights) {
        this.userName = userName;
        this.name = name;
        this.theme = theme;
        this.email = email;
        this.password = password;
        this.profileImg = profileImg;
        this.following = following;
        this.followers = followers;
        this.stories = stories;
        this.hasStories = hasStories;
        this.highlights = highlights;
    }

    // getters and setters
    
    public int getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getStories() {
        return stories;
    }

    public void setStories(String stories) {
        this.stories = stories;
    }

    public String getHasStories() {
        return hasStories;
    }

    public void setHasStories(String hasStories) {
        this.hasStories = hasStories;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights;
    }

}
