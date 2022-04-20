package com.codeup.springblog.repositories;
import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {
    //     Custom Queries
    Post findPostByTitle(String title);

//    @Query("from Post p where p.title like %:postTitle%")
//    List<Post> getPostById(@Param("postTitle") String title);
}
