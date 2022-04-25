package com.codeup.springblog.controllers;

import com.codeup.springblog.models.EmailService;
import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import com.codeup.springblog.repositories.PostRepo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private PostRepo postDao;
    private UserRepository userDao;
    private User user;
//    com.codeup.springblog.models.User
private final EmailService emailService;

    public PostController(PostRepo postDao, UserRepository userDao,EmailService emailService) {
        this.postDao = postDao;
        this.userDao = userDao;
        this.emailService = emailService;
    }

    @GetMapping("/posts")
    public String posts(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{title}")
    public String postById(@PathVariable String title,Model model){
        model.addAttribute("posts", postDao.findPostByTitle(title));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postForm(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post newPost){
        postDao.save(newPost);
        return "redirect:/posts";
    }


}
