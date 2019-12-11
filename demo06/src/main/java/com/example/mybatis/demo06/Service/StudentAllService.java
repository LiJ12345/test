package com.example.mybatis.demo06.Service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentAllService {
    List linkTableSel(@Param("id")int id);
}
