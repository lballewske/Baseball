package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

//https://api.stattleship.com/baseball/mlb/teams

public class DivisionDTO extends BaseDTO {
    @JsonProperty("id")
    private String externalId;
    @JsonProperty("created_at") // "2016-03-18T20:56:44-04:00"
    private Date createdAt;
    @JsonProperty("updated_at") // "2016-07-12T19:34:13-04:00"
    private Date updatedAt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("conference_id")
    private String conferenceId;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }
}
