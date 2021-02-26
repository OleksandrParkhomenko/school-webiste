package com.schoolwebsite.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PostDto {
    private long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotNull
    private String text;

    public PostDto(long id, String title, String author, String text) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
