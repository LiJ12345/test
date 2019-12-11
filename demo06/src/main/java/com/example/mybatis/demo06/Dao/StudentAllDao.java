package com.example.mybatis.demo06.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Mapper
public interface StudentAllDao {
    List linkTableSel(@RequestParam("id")int id);
}
