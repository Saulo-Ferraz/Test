package com.example.Projeto.repository;

public class Post {
 
    private String titulo;
    private Usuario autor;
    private String categoria;
    private String texto;
    private String data;
  
    public Post() {}
  
    public Post(String titulo, Usuario autor, String categoria, String texto, String data) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.texto = texto;
        this.data = data;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Usuario getAutor() {
        return autor;
    }
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
  }
