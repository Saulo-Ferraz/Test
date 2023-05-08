package com.example.Projeto.repository;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    
    Scanner sc = new Scanner(System.in);

    private String username;
    private String senha;
    private String email;
    private String nomeCompleto;
    private String tipoUsuario;
    private int idUsuario;
    private ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public Usuario() {}

    public Usuario(String username, String senha, String email, String nomeCompleto , 
                    String tipoUsuario, int idUsuario, ArrayList<Playlist> playlists) {

        this.username = username;
        this.senha = senha;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.tipoUsuario = tipoUsuario;
        this.idUsuario = idUsuario;
        this.playlists = playlists;

    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    private Playlist criaPlaylist() {

            Playlist playlist = new Playlist();

            System.out.println("Informe o nome da playlist: ");
            playlist.setNome(sc.next());
            System.out.println("Informe a descrição da playlist: ");
            playlist.setDescricao(sc.next());
            System.out.println("Informe a Data: ");
            playlist.setData(sc.next());

            return playlist;
    }
   
    public void criarPlaylist() {
        Playlist playlist = criaPlaylist();

        playlists.add(playlist);
    }

    private Post criaPost() {

            Post post = new Post();

            System.out.println("Informe o Título do Post: ");
            post.setTitulo(sc.next());
            System.out.println("Qual a categoria do Post: ");
            post.setCategoria(sc.next());
            System.out.println("Insira o texto do Post: ");
            post.setTexto(sc.next());
            System.out.println("Informe a Data: ");
            post.setData(sc.next());

            return post;
    }

    public void criarPost(){

        Post post = criaPost();
    }

}

