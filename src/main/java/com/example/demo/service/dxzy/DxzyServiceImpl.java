package com.example.demo.service.dxzy;

import com.example.demo.dao.entity.DxzyXueweiEntity;
import com.example.demo.dao.repo.DxzyXueweiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yaochao on 2018/12/20 下午5:25
 */
@Service
public class DxzyServiceImpl implements DxzyService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    DxzyXueweiRepository dxzyXueweiRepository;

    @Override
    public DxzyXueweiEntity getXuewei(String name) {

        return dxzyXueweiRepository.findByName(name);
    }

    @Override
    public Object getXueweiWithName(String name) {
        Query query = entityManager.createNativeQuery("SELECT * from dxzy_xuewei where name='" + name + "'");
        List<Object> resultList = query.getResultList();
        List<Object> rs = new ArrayList<>();
        resultList.forEach(oneRow -> {
            Map<String, Object> item = new HashMap<>();
            Object[] one = (Object[]) oneRow;
            item.put("id", one[0]);
            item.put("name", one[1]);
            item.put("pinyin", one[2]);
            rs.add(item);
        });
        return rs;
    }


}
