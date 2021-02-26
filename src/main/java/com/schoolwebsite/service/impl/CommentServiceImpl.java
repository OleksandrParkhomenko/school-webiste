package com.schoolwebsite.service.impl;

import com.schoolwebsite.model.Comment;
import com.schoolwebsite.repository.CommentRepository;
import com.schoolwebsite.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;


    @Override
    public Comment create(Comment comment) { return commentRepository.save(comment); }

    @Override
    public Comment readById(long id) {
        return commentRepository.getById(id);
    }

    @Override
    public List<Comment> readByPostId(long postId) {
        return commentRepository.getByPostId(postId);
    }

    @Override
    public Comment update(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void delete(long id) {
        commentRepository.delete(readById(id));
    }
}
