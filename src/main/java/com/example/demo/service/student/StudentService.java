package com.example.demo.service.student;

import com.example.demo.dao.entity.StudentEntity;

public interface StudentService {

    StudentEntity findStudentById(Integer id);

    Integer insertStudent(String name, String password, String phone);
}
