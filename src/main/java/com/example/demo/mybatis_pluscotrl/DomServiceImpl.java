package com.example.demo.mybatis_pluscotrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DomServiceImpl implements  DomService{

    @Autowired
    DomServerMapper domServerMapper;

    @Override
    public List<Map> list() {
        List<Map> list=domServerMapper.list();
        return list;
    }

    @Override
    public Map listtree() {
        Map<String, Object> maplist = new HashMap<>();
        List<Map> result = null;
        List<Map> arr = new ArrayList();
        try {

            result=domServerMapper.listtree();
            List<Map> newlist = result.stream().filter(v -> v.get("fid").equals("")).collect(Collectors.toList());

            for (int i = 0; i < result.size(); i++) {
                Map<String, Object> row = newlist.get(i);
                row.put("subItems", showMenu(row, result));
                arr.add(row);
            }

            } catch (Exception ex) {
        }
        maplist.put("menuList",arr);
        return maplist;
    }

    /**
     * 递归查询数据  2021   1.28 end
     */
    public static List<Map<String, Object>> showMenu(Map<String, Object> parentMenu, List<Map> menuList) {
        List<Map<String, Object>> childList = new ArrayList<>();

        List<Map> newlist = menuList.stream().filter(v ->v.get("fid").equals(String.valueOf(parentMenu.get("level"))) ).collect(Collectors.toList());

        for (int i = 0; i < newlist.size(); i++) {
            Map<String, Object> menu = newlist.get(i);
            for (int j = 0; j < menuList.size(); j++) {
                if (String.valueOf(menu.get("level")).equals(menuList.get(j).get("fid"))) {
                    menu.put("subItems", showMenu(menu, menuList));
                }
            }
            childList.add(menu);
        }
        System.out.println(childList);
        return childList;
    }




}
