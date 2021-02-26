package com.schoolwebsite.service;

import com.schoolwebsite.model.Comment;

import java.util.List;

public interface CommentService {
    public Comment create(Comment comment);

    public Comment readById(long id);

    public List<Comment> readByPostId(long postId);

    public Comment update(Comment comment);

    public void delete(long id);
}
