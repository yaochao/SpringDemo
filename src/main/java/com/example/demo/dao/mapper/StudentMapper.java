package com.example.demo.dao.mapper;

import com.example.demo.dao.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by yaochao on 2018/12/21 下午5:00
 */

@Mapper
@Component
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id=#{id}")
    StudentEntity findUserById(@Param("id") Integer id);

    @Insert("INSERT INTO student(name, password, phone) VALUES (#{name}, #{password}, #{phone})")
    Integer InsertStudent(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);
}
