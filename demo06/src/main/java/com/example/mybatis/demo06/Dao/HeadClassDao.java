package com.example.mybatis.demo06.Dao;

import com.example.mybatis.demo06.Entity.HeadClass;
import com.example.mybatis.demo06.Entity.HeadTeacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
@Mapper
public interface HeadClassDao {
    HeadClass selectClassById(@Param("id")int id);
    List<HeadTeacher> getHeadTeacher();
    List<HeadClass> selectClassAndStudentById(@Param("id")int id);
}
