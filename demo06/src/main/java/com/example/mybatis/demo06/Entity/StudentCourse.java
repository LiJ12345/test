package com.example.mybatis.demo06.Entity;

import java.util.Date;
import java.util.List;

public class StudentCourse {
    private List<Student> students;
    private List<Course> courses;
    private Date date;

    public StudentCourse() {
    }

    public StudentCourse(List<Student> students, List<Course> courses, Date date) {
        this.students = students;
        this.courses = courses;
        this.date = date;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
