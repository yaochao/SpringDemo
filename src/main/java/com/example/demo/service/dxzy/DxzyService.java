package com.example.demo.service.dxzy;

import com.example.demo.dao.entity.DxzyXueweiEntity;

public interface DxzyService {
    DxzyXueweiEntity getXuewei(String name);

    Object getXueweiWithName(String name);
}
