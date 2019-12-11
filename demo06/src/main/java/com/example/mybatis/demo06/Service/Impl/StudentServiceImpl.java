package com.example.mybatis.demo06.Service.Impl;

import com.example.mybatis.demo06.Dao.StudentDao;
import com.example.mybatis.demo06.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentDao {
    @Autowired
    public StudentDao studentDao;

    @Override
    public List<Student> selectStudentCourse() {
        return studentDao.selectStudentCourse();
    }
}
