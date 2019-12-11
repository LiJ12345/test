package com.example.mybatis.demo06.Controller;

import com.example.mybatis.demo06.Service.Impl.StudentAllServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Api(value = "/",description = "这是我StudentAll的操作方法")
public class StudentAllController {
    @Autowired
    public StudentAllServiceImpl studentAllService;
    @RequestMapping(value = "/getStudentAll",method = RequestMethod.GET,produces = {"application/json"})
    @ApiOperation(value = "通过ID获取到学生的信息",httpMethod = "GET")
    public List StudentAll(@RequestParam("id")int id){
        return studentAllService.linkTableSel(id);
    }
}
