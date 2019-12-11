package com.example.mybatis.demo06.Entity;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;
    private List<Course> courses;

    public Student() {
    }

    public Student(int id, String name, String sex, int age, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.courses = courses;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
