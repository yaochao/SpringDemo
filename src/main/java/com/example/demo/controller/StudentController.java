package com.example.demo.controller;

import com.example.demo.service.student.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaochao on 2018/12/21 下午5:10
 */

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "获取学生", notes = "通过id获取")
    @RequestMapping(value = "getStudentById", method = RequestMethod.GET)
    public Object getStudentById(@RequestParam Integer id) {
        return studentService.findStudentById(id);
    }
}
