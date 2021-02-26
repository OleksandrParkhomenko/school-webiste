package com.schoolwebsite.repository;

import com.schoolwebsite.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Query(value = "SELECT * FROM posts ORDER BY id", nativeQuery = true)
    List<Post> getAll();

    @Query(value = "SELECT * FROM posts WHERE id=?1", nativeQuery = true)
    Post getById(long id);

    @Query(value = "SELECT * FROM posts WHERE title=?1", nativeQuery = true)
    Post getByTitle(String title);
}
