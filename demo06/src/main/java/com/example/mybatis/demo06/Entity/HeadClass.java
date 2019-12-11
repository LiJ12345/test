package com.example.mybatis.demo06.Entity;

import java.util.List;

public class HeadClass {
    private int cid;
    private String cname;
    private List<HeadTeacher> headTeachers;
    private List<Student> students;

    public HeadClass() {
    }

    public HeadClass(int i, HeadClass headClass) {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<HeadTeacher> getHeadTeachers() {
        return headTeachers;
    }

    public void setHeadTeachers(List<HeadTeacher> headTeachers) {
        this.headTeachers = headTeachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
