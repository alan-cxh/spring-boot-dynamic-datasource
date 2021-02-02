package com.apedad.example.dao;

import com.apedad.example.entity.PostUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PostUserMapper {

    List<Map<String, Object>> getList();

    void insert(@Param("i") int i);

    void update(@Param("i") int i);
}
