package com.schoolwebsite.controller;

import com.schoolwebsite.dto.PostDto;
import com.schoolwebsite.dto.PostTransformer;
import com.schoolwebsite.model.Post;
import com.schoolwebsite.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping({"/", "/all"})
    public String readAll(Model model) {
        List<Post> posts = postService.readAll();
        model.addAttribute("posts", posts);
        return "posts-list";
    }

    @GetMapping("/{id}")
    public String readPost(@PathVariable("id") long id, Model model) {
        Post post = postService.readById(id);
        model.addAttribute("post", post);
        model.addAttribute("title", String.format("Post #%d", id));
        return "post-read";
    }

    @GetMapping("/create")
    public String createPost(Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("title", "Create new post");
        return "post-create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute("post") Post post) {
        postService.create(post);
        return "redirect:/posts/all";
    }

    @GetMapping("/{id}/update")
    public String updatePost(@PathVariable("id") long id, Model model) {
        PostDto postDto = PostTransformer.convertToDto(postService.readById(id));
        model.addAttribute("post", postDto);
        return "post-update";
    }

    @PostMapping("/{id}/update")
    public String updatePost(@PathVariable("id") long id, @ModelAttribute("post") PostDto postDto, Model model) {
        Post post = PostTransformer.convertToEntity(postDto);
        postService.update(post);
        return "redirect:/posts/{id}";
    }

    @GetMapping("/{id}/delete")
    public String deletePost(@PathVariable("id") long id, Model model) {
        postService.delete(id);
        return "redirect:/posts/all";
    }

}
