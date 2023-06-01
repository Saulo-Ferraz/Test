package com.example.Projeto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Playlist {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private LocalDate date;
        
        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;
}
