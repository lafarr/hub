package com.hub.posts.models;

import java.util.Date;

public class Comment {
    private String content;
    private String userId;
    private Date dateCommented;

    public Comment(String content, String userId, Date dateCommented) {
        this.content = content;
        this.userId = userId;
        this.dateCommented = dateCommented;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(Date dateCommented) {
        this.dateCommented = dateCommented;
    }
}
