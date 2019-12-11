package com.example.mybatis.demo06.Entity;

import java.util.List;

public class Course {
    private int id;
    private String cname;
    private int credit;
    private List<Student> students;

    public Course() {
    }

    public Course(int id, String name, int credit, List<Student> students) {
        this.id = id;
        this.cname = name;
        this.credit = credit;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return cname;
    }

    public void setName(String cname) {
        this.cname = cname;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
