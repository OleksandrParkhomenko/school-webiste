package com.schoolwebsite.controller;

import com.schoolwebsite.dto.CommentDto;
import com.schoolwebsite.dto.CommentTransformer;
import com.schoolwebsite.model.Comment;
import com.schoolwebsite.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/post/{post_id}/create")
    public String createComment(@PathVariable("post_id") long post_id,
                                @ModelAttribute("comment") Comment comment,
                                Model model) {
        commentRepository.save(comment);
        return "redirect:/posts/{post_id}";
    }
}
