package com.schoolwebsite.service;

import com.schoolwebsite.model.Post;

import java.util.List;

public interface PostService {
    public Post create(Post post);

    public List<Post> readAll();

    public Post readById(long id);

    public Post readByTitle(String title);

    public Post update(Post post);

    public void delete(long id);
}

