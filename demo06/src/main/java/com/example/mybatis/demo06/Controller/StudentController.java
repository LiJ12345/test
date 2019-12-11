package com.example.mybatis.demo06.Controller;

import com.example.mybatis.demo06.Entity.Student;
import com.example.mybatis.demo06.Service.Impl.StudentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "/",description = "这是我Student的操作方法")
public class StudentController {
    @Autowired
    public StudentServiceImpl studentService;
    @RequestMapping(value = "/getStudentCourse",method = RequestMethod.GET,produces = {"application/json"})
    @ApiOperation(value = "获取学生和课程信息",httpMethod = "GET")
    public List<Student> getStudentCourse(){
        return studentService.selectStudentCourse();
    }
}
