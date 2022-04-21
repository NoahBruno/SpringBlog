package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Post, Long> {
}
