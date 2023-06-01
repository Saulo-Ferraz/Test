package com.example.Projeto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import jakarta.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Post {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		private String text;
		private LocalDate date;
		
		@ManyToOne
        @JoinColumn(name = "user_id")
        private User user;
		
		@OneToMany(mappedBy = "Post")
		private List<Tag> tags;
		
		@OneToMany(mappedBy = "Post")
		private List<Comment> comments;
}
