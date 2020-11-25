package com.example.demo.gclcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Controller
public class GclController {

    @RequestMapping("/user")
    public String str(){
        return "hello word!";
    }

    public static void main(String[] args) {
        List<String> colors = Stream.of("blue", "red", "yellow").collect(toList());
        System.out.println(colors);




    }
}
