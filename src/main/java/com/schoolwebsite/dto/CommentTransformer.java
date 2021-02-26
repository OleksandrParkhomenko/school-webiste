package com.schoolwebsite.dto;

import com.schoolwebsite.model.Comment;

public class CommentTransformer {
    public static CommentDto convertToDto(Comment comment) {
        return new CommentDto(
                comment.getId(),
                comment.getPost(),
                comment.getAuthor(),
                comment.getText()
        );
    }

    public static Comment convertToEntity(CommentDto commentDto) {
        Comment comment = new Comment();
        comment.setId(commentDto.getId());
        comment.setPost(commentDto.getPostId());
        comment.setAuthor(commentDto.getAuthor());
        comment.setText(commentDto.getText());
        return comment;
    }
}
