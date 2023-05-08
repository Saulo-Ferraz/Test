package com.example.Projeto.repository;

import java.util.ArrayList;

public class Playlist {
        
    private String nome;
    private String descricao;
    private Usuario criador;
    private String data;
    private ArrayList<String> listaMusicas = new ArrayList<String>();

    public Playlist() {}



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Usuario getCriador() {
        return criador;
    }
    public void setCriador(Usuario criador) {
        this.criador = criador;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ArrayList<String> getListaMusicas() {
        return listaMusicas;
    }
    public void setListaMusicas(ArrayList<String> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }
    public void addMusicas(String listaMusicas) {
        this.listaMusicas.add(listaMusicas);
    }
}
