package com.example.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Projeto.model.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
