package com.example.mybatis.demo06.Service;

import com.example.mybatis.demo06.Entity.HeadClass;
import com.example.mybatis.demo06.Entity.HeadTeacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HeadClassService {
    HeadClass selectClassById(@Param("id")int id);
    List<HeadTeacher> getHeadTeacher();
    List<HeadClass> selectClassAndStudentById(@Param("id")int id);
}
