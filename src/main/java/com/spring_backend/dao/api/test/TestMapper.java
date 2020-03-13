package com.spring_backend.dao.api.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    // public List<HashMap<String, String>> getTest(HashMap<String, Object> map);
    // public int get(Map<String, Object> map);

    // Map<String,Object> param = new HashMap<String,Object>();
    public List<HashMap<String, Object>> getTest();

    // Integer param1 = 1;
    // public int getTest2(Integer param1);
    // List<Map<String, Object>> getTest();
}