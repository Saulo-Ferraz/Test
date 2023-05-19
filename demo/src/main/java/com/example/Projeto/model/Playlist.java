package com.example.Projeto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Playlist {
    
        private Long id;
        private String nome;
        private LocalDate data;
        private User user;
}
