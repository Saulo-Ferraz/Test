package com.example.Projeto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.example.Projeto.model.User;

import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PostDTO {
	private Long Id;
	private String texto;
	private LocalDate data;
	private User user;
}
