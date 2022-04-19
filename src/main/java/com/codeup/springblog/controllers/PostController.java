package com.codeup.springblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class PostController {
    @GetMapping("/posts")
    public String posts(Model model){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String postById(@PathVariable long id){
        return "individual posts " + id;
    }

    @GetMapping("/posts/create")
    public String postForm(){
        return "form for creating a post";
    }

    @PostMapping("/posts/create")
    public String createPost(){
        return "redirect to post";
    }
}
