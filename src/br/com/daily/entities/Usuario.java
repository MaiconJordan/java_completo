package br.com.daily.entities;

public class Usuario {
    private Integer Id;
    private String nome;
    private Integer level;
    private  String email;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, Integer level, String email) {
        Id = id;
        this.nome = nome;
        this.level = level;
        this.email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

