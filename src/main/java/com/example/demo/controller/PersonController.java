package com.example.demo.controller;

import com.example.demo.service.person.PersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yaochao on 2018/12/19 下午6:06
 */

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @ApiOperation(value = "获取person列表", notes = "获取person列表")
    @RequestMapping(value = "getPersonList", method = RequestMethod.GET)
    public Object getPersonList() {
        return personService.getPersonList();
    }

}
