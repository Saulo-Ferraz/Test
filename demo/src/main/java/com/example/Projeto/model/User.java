package com.example.Projeto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String username;
	private String password;
		
		
	@OneToMany(mappedBy = "User")
	private List<Playlist> playlists;
		
	@OneToMany(mappedBy = "User")
	private List<Post> posts;
		

}
