package com.example.Projeto.dto;

import java.time.LocalDate;
import com.example.Projeto.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class PlaylistDTO {
	private Long id;
	private String nome;
	private LocalDate data;
	private User user;
}
