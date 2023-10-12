package com.gutomelo.virtualbank.users;

public class User {
    private long idUser;
    private String name;
    private long cpf;

    public void setHolder(long idUser, String name, long cpf){
        this.idUser = idUser;
        this.name = name;
        this.cpf = cpf;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
