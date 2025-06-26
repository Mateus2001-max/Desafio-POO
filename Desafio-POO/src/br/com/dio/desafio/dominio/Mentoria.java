package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    
    
    public Mentoria() {
    }

    private String titulo;
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + 
        ", descricao=" + descricao + 
        ", data=" + data + "]";
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private LocalDate data;
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    
}
