package com.example.demo.mybatis_plus;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("testuu")
public class Dom {

    private int  age;
    private int  id;
    private String name;
    private String sex;

}
