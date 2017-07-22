package com.mycompany.app;
public class Employee {
    private Integer id, age;
    private String name, gender;

    Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return this.id.toString() + this.name.toString() + this.age.toString() + this.gender.toString();
    }
}

