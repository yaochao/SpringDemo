package com.example.demo.dao.repo;

import com.example.demo.dao.entity.DxzyXueweiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yaochao on 2018/12/20 下午5:15
 */
public interface DxzyXueweiRepository extends JpaRepository<DxzyXueweiEntity, Long> {

    DxzyXueweiEntity findByName(String name);
}
