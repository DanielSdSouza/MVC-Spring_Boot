package com.example.softwareengineering.models;

public class filmes {

    String nomeFilme;
    int duracao;

    public filmes(String nomeFilme, int duracao) {
        this.nomeFilme = nomeFilme;
        this.duracao = duracao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
