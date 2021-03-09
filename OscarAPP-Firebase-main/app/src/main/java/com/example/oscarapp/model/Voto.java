package com.example.oscarapp.model;

public class Voto {

    private String uuid, voto_diretor, voto_filme, username;
    private Integer token;

    public Voto() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVoto_diretor() {
        return voto_diretor;
    }

    public void setVoto_diretor(String voto_diretor) {
        this.voto_diretor = voto_diretor;
    }

    public String getVoto_filme() {
        return voto_filme;
    }

    public void setVoto_filme(String voto_filme) {
        this.voto_filme = voto_filme;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }
}
