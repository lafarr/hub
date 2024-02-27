package com.hub.posts.models;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Post {
    @Id
    private String id;
    private String userId;
    private String postContent;
    private long numberOfLikes;
    private List<String> usersThatHaveLiked;
    private long numberOfComments;
    private List<Comment> comments;

    public Post(String id, String userId, String postContent, long numberOfLikes, List<String> usersThatHaveLiked, long numberOfComments, List<Comment> comments) {
        this.id = id;
        this.userId = userId;
        this.postContent = postContent;
        this.numberOfLikes = numberOfLikes;
        this.usersThatHaveLiked = usersThatHaveLiked;
        this.numberOfComments = numberOfComments;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public long getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(long numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public List<String> getUsersThatHaveLiked() {
        return usersThatHaveLiked;
    }

    public void setUsersThatHaveLiked(List<String> usersThatHaveLiked) {
        this.usersThatHaveLiked = usersThatHaveLiked;
    }

    public long getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(long numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
