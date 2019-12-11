package com.example.mybatis.demo06.Dao;

import com.example.mybatis.demo06.Entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
     List<Student> selectStudentCourse();
}
