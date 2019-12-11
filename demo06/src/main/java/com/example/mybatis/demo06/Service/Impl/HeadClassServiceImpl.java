package com.example.mybatis.demo06.Service.Impl;

import com.example.mybatis.demo06.Dao.HeadClassDao;
import com.example.mybatis.demo06.Entity.HeadClass;
import com.example.mybatis.demo06.Entity.HeadTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadClassServiceImpl implements HeadClassDao{
    @Autowired
    private HeadClassDao headClassDao;

    @Override
    public HeadClass selectClassById(int id) {
        return headClassDao.selectClassById(id);
    }

    @Override
    public List<HeadTeacher> getHeadTeacher() {
        return headClassDao.getHeadTeacher();
    }

    @Override
    public List<HeadClass> selectClassAndStudentById(int id) {
        return headClassDao.selectClassAndStudentById(id);
    }
}
