package com.example.Projeto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserDTO {
		private Long id;
		private String username;
		private String password;
}
