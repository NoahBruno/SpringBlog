package com.codeup.springblog.models;

public class Post {
    private String title;
    private String body;
//    private User user;
    public Post() {
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
//        this.user = user;
    }

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    public void setId(Post byId) {
//    }
}

