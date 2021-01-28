package com.example.demo.mybatis_pluscotrl;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
@Configuration
@Mapper
public interface DomServerMapper extends BaseMapper<Dom> {


    List<Map> list();

    List<Map> listtree();
}
