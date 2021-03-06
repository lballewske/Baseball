package com.lauren.db;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="teams")
public class Team extends BaseEntity {
    private int id;
    private String externalId;
    private Date createdAt;
    private Date updatedAt;
    private String abbreviation;
    private String[] colors;
    private String hashtag;
    private String[] hashtags;
    private String name;
    private String nickname;
    private float lattitude;
    private float longitude;
    private String slug;
    private Division division;
    private League league;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="external_id", nullable=false)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Column(name="created_at", nullable=false)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name="updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name="abbreviation", nullable=false)
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Column(name="colors", nullable=false)
    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    @Column(name="hashtag", nullable=false)
    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    @Column(name="hashtags", nullable=false)
    public String[] getHashtags() {
        return hashtags;
    }

    public void setHashtags(String[] hashtags) {
        this.hashtags = hashtags;
    }

    @Column(name="name", nullable=false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="nickname", nullable=false)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name="lattitude", nullable=false)
    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    @Column(name="longitude", nullable=false)
    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Column(name="slug", nullable=false)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_id")
    public Division getDivision() { return division; }

    public void setDivision(Division division) { this.division = division; }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    public League getLeague() { return league; }

    public void setLeague(League league) { this.league = league; }
}


