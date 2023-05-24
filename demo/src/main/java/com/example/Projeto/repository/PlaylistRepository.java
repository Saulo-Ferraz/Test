package com.example.Projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Projeto.model.Playlist;
import org.springframework.stereotype.Repository;

public interface PlaylistRepository extends JpaRepository<Playlist,Long>{

}
