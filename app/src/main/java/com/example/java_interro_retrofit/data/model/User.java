package com.example.java_interro_retrofit.data.model;

import java.util.List;

public class User {
    int total_count;
    List<Items> items;

    public User(){}

    public User(int total_count, List<Items> items) {
        this.total_count = total_count;
        this.items = items;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
