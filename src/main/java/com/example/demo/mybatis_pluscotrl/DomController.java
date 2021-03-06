package com.example.demo.mybatis_pluscotrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DomController {

    @Autowired
    DomService  domService;



    @GetMapping("get")
    public String strv(){
        return "hello world!";
    }

    @GetMapping("list")
    public List<Map> list(){
        List<Map> list= domService.list();
        return list;
    }

    public static void main(String[] args) {

    }

    /**
     *
     * @return   map  树
     */
    @GetMapping("listtree")
    public Map listtree(){
        Map list= domService.listtree();
        return list;
    }

}
