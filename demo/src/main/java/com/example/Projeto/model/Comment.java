package com.example.Projeto.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {
	
	private String text;
	private User user;
	private LocalDate date;
	
	@ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
}
