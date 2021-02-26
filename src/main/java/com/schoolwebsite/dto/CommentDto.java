package com.schoolwebsite.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CommentDto {
    private long id;

    @NotNull
    private long postId;

    @NotBlank
    private String author;


    @NotNull
    private String text;

    public CommentDto(long id, @NotNull long postId, @NotBlank String author, @NotNull String text) {
        this.id = id;
        this.postId = postId;
        this.author = author;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
