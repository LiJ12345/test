package com.example.mybatis.demo06.Service;

import com.example.mybatis.demo06.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> selectStudentCourse();
}
