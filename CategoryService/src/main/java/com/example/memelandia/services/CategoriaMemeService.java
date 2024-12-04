package com.example.memelandia.services;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_categoria_meme")
    @SequenceGenerator(name = "sequence_categoria_meme", sequenceName = "sequence_categoria_meme", allocationSize = 50)
    private Long id;

    private String nome;
    private String descricao;
    private LocalDate dataCadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
