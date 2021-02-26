package com.schoolwebsite.service.impl;

import com.schoolwebsite.model.Post;
import com.schoolwebsite.repository.PostRepository;
import com.schoolwebsite.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post create(Post post) { return postRepository.save(post); }

    @Override
    public List<Post> readAll() {
        return postRepository.getAll();
    }

    @Override
    public Post readById(long id) {
        return postRepository.getById(id);
    }

    @Override
    public Post readByTitle(String title) {
        return postRepository.getByTitle(title);
    }

    @Override
    public Post update(Post post) { return postRepository.save(post); }

    @Override
    public void delete(long id) { postRepository.delete(readById(id)); }
}
