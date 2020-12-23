package com.example.demo.gclcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@RestController
public class GclController {

    @RequestMapping("/user")
    public String str(){
        return "hello word!";
    }
    @RequestMapping("vvv")
    public String strv(){
        return "hello word!";
    }

    public static void main(String[] args) {
        List<String> colors = Stream.of("blue", "red", "yellow").collect(toList());
        System.out.println(colors);

    }


//    /**
//     * 自定义 spring   加载 appliction.properties
//     */
//    @RequestMapping(value="refreshXmlWebApplicationContext2016")
//    public void refresh(HttpServletRequest request){
//        XmlWebApplicationContext context =
//                (XmlWebApplicationContext) WebApplicationContextUtils
//                        .getWebApplicationContext(requestm.getServletContext());
//        context.refresh();
//
//
//    }

//    @Autowired
//    private  GclService gclService;
//    /**
//     *  添加接口 查询数据库
//     * @param
//     */
//    @RequestMapping("list")
//    public List<Map> selectlist(){
//        Map map=new HashMap();
//        List list=new ArrayList();
//
//        map=gclService.list();
//        list.add(map);
//        return  list;
//    }

}
