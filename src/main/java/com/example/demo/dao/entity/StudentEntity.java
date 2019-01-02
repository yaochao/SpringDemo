package com.example.demo.dao.entity;

/**
 * Created by yaochao on 2018/12/21 下午4:58
 */
public class StudentEntity {
    private Long id;
    private String name;
    private String password;
    private String phone;

    public StudentEntity(Long id, String name, String password, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

//    public StudentEntity(String name, String password, String phone) {
//        this.name = name;
//        this.password = password;
//        this.phone = phone;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
