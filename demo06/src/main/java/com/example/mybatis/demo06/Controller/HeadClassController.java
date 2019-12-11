package com.example.mybatis.demo06.Controller;

import com.example.mybatis.demo06.Entity.HeadClass;
import com.example.mybatis.demo06.Entity.HeadTeacher;
import com.example.mybatis.demo06.Service.Impl.HeadClassServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "/",description = "这是我HeadClass的操作方法")
public class HeadClassController {
    @Autowired
    private HeadClassServiceImpl headClassService;
    @RequestMapping(value = "/classInfo",method = RequestMethod.GET,produces = {"application/json"})
    @ApiOperation(value = "通过ID获取到班级信息",httpMethod = "GET")
    public HeadClass getClassInfo(@RequestParam(value = "id") Integer id){
        return headClassService.selectClassById(id);
    }

    @RequestMapping(value = "/getTeacherinfo",method = RequestMethod.GET,produces = {"application/json"})
    @ApiOperation(value = "获取到班主任的信息",httpMethod = "GET")
    public List<HeadTeacher> getHeadTeacher(){
        return headClassService.getHeadTeacher();
    }

    @RequestMapping(value = "/getclassandstudent",method = RequestMethod.GET,produces = {"application/json"})
    @ApiOperation(value = "通过ID获取到班级和学生的信息",httpMethod = "GET")
    public List<HeadClass> getClassAndStudent(@RequestParam(value = "id") Integer id){
        return headClassService.selectClassAndStudentById(id);
    }
}
