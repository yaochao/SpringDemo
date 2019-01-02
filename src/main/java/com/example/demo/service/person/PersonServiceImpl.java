package com.example.demo.service.person;

import com.example.demo.dao.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaochao on 2018/12/19 下午6:02
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getPersonList() {
        Person p1 = new Person("张三", "20", "男");
        Person p2 = new Person("李四", "30", "女");
        Person p3 = new Person("王五", "50", "男");
        List<Person> result = new ArrayList<>();
        result.add(p1);
        result.add(p2);
        result.add(p3);
        return result;
    }
}
