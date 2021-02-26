package com.schoolwebsite.dto;

import com.schoolwebsite.model.Post;

public class PostTransformer {
    public static PostDto convertToDto(Post post) {
        return new PostDto(
                post.getId(),
                post.getTitle(),
                post.getAuthor(),
                post.getText()
        );
    }

    public static Post convertToEntity(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setAuthor(postDto.getAuthor());
        post.setTitle(postDto.getTitle());
        post.setText(postDto.getText());
        return post;
    }

}
