package com.example.demo.mybatis_plus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DomServiceImpl implements  DomService{

    @Autowired
    DomServerMapper domServerMapper;


    @Override
    public List<Map> list() {
        List<Map> list=domServerMapper.list();
        return list;
    }
}
