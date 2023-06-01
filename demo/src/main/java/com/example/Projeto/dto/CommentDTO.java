package com.example.Projeto.dto;

import java.time.LocalDate;
import com.example.Projeto.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class CommentDTO {
	private String text;
	private User user;
	private LocalDate date;

}
