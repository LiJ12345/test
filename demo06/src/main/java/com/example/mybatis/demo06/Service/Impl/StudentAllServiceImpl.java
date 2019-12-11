package com.example.mybatis.demo06.Service.Impl;

import com.example.mybatis.demo06.Dao.StudentAllDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentAllServiceImpl implements StudentAllDao{
    @Autowired
    private StudentAllDao studentAllDao;

    @Override
    public List linkTableSel(int id) {
        return studentAllDao.linkTableSel(id);
    }
}
