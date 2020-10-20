package com.test.demo;

import com.test.demo.dao.testDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private testDao testdao;
    @Test
    void contextLoads() {
        List<Map<String,Object>> value = testdao.select(); //查询
        System.out.println(value);
        //testdao.insert("reole","哈哈哈"); //插入

    }

}
