package com.example.Projeto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
  
  private Long id;
  private String name;
  private String username;
  private List<Playlist> playlists;

}