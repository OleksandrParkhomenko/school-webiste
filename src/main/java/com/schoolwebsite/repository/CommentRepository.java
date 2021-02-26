package com.schoolwebsite.repository;

import com.schoolwebsite.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "SELECT * FROM comments WHERE id=?1", nativeQuery = true)
    Comment getById(long id);

    @Query(value = "SELECT * FROM comments WHERE post_id=?1 ORDER BY id", nativeQuery = true)
    List<Comment> getByPostId(long id);
}
