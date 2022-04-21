package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import com.codeup.springblog.repositories.PostRepo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
    private PostRepo postDao;
    private UserRepository userDao;
    private User user;
//    com.codeup.springblog.models.User

    public PostController(PostRepo postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
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
        model.addAttribute("posts", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@RequestParam (name="title")String title,
                             @RequestParam(name="body") String body,
                             Model model){
        postDao.save(new Post(title,body, user));
        return "redirect:/posts";
    }


}
