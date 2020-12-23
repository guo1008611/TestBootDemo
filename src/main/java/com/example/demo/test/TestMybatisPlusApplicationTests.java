package com.example.demo.test;

import com.example.demo.mybatis_plus.Dom;
import com.example.demo.mybatis_plus.DomServerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class TestMybatisPlusApplicationTests {

    @Autowired
    private DomServerMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Dom> userList = userMapper.selectList(null);
        for(Dom user:userList) {
            System.out.println(user);
        }
        //userList
    }


    @Test
    public void testSelects() {
//        String filePath = System.getProperty("user.dir")
//                + "/config/activity-config.json";
//        System.out.println(filePath);
        String aa=System.getProperty("user.dir");
        System.out.println(aa);
    }
}
