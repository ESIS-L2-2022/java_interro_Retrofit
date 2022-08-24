package com.example.java_interro_retrofit.data.model;

public class Items {
    String login;
    int id;

    public Items() {
    }

    public Items(String login, int id) {
        this.login = login;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
