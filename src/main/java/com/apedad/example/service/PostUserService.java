package com.apedad.example.service;

import com.apedad.example.annotation.TargetDataSource;
import com.apedad.example.commons.DataSourceKey;

import java.util.List;
import java.util.Map;

public interface PostUserService {
    List<Map<String, Object>> list();

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    void insert(int i);

    @TargetDataSource(dataSourceKey = DataSourceKey.DB_SLAVE1)
    void update(int i);
}
