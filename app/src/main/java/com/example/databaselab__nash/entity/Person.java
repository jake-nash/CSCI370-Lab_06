package com.example.databaselab__nash.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

