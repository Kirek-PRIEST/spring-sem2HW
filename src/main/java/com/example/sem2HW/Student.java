package com.example.sem2HW;

import lombok.Data;

@Data
public class Student {
    private static Integer idCounter = 1;
    private int id; //id студента
    private String name; // имя студента
    private String group; // группа студента

    public Student(String name, String group) {
        this.id = idCounter++;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }
}
