package com.apedad.example.service.impl;

import com.apedad.example.annotation.TargetDataSource;
import com.apedad.example.commons.DataSourceKey;
import com.apedad.example.dao.PostUserMapper;
import com.apedad.example.service.PostUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PostUserServiceImpl implements PostUserService {

    @Autowired(required = false)
    private PostUserMapper postUserMapper;

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public List<Map<String, Object>> list() {
        return postUserMapper.getList();
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public void insert(int i) {
        for (int j = 0; j < i; j++) {
            postUserMapper.insert(j);
        }
    }


    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    @Override
    public void update(int i) {
        for (int j = 0; j < i; j++) {
            postUserMapper.update(j);
        }
    }


}
