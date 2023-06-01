package com.example.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Projeto.model.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long>{

}
