package com.springblog.api.controller;

import com.springblog.api.domain.Post;
import com.springblog.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/postList")
    public String postList(Model model) throws Exception{

        model.addAttribute("name", "SpringBlog from Millky");

        List<Post> postList = postService.getPostsAll();
        model.addAttribute("postList", postList);

        return "posts/postList";
    }
}
