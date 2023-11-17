package com.instagram.instagram.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "highlights")
public class Highlight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hid")
    private int hid;

    @Column(name = "belongs_to")
    private int belongsTo;

    @Column(name = "title")
    private String title;

    @Column(name = "hl")
    private String hl;

    public Highlight() {

    }

    public Highlight(int belongsTo, String title, String hl) {
        this.belongsTo = belongsTo;
        this.title = title;
        this.hl = hl;
    }

    public int getHid() {
        return hid;
    }

    public int getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(int belongsTo) {
        this.belongsTo = belongsTo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

}
