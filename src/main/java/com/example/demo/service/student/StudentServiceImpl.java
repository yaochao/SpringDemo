package com.example.demo.service.student;

import com.example.demo.dao.entity.StudentEntity;
import com.example.demo.dao.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yaochao on 2018/12/21 下午5:09
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public StudentEntity findStudentById(Integer id) {
        return studentMapper.findUserById(id);
    }

    @Override
    public Integer insertStudent(String name, String password, String phone) {
        return insertStudent(name, password, phone);
    }
}
