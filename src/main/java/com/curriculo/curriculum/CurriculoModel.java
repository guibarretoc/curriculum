package com.curriculo.curriculum;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
public class CurriculoModel {

    //colocar o que o curriculo tem (nome, telefone e etc... atribultos construtores get e set//
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    private String telefone;

    @Column
    private String endereco;

    @Column
    private String email;

    @Column
    private String objetivo;

    @Column
    private String formacao;

    @Column
    private String curso;

    @Column
    private String experiencias;

    public CurriculoModel(String nome, int idade, String telefone, String endereco, String email, String objetivo, String formacao, String curso, String experiencias) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.objetivo = objetivo;
        this.formacao = formacao;
        this.curso = curso;
        this.experiencias = experiencias;
    }
    public CurriculoModel(){

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }
}
