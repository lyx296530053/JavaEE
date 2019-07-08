package cn.lyx.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
    @RequestMapping("/test1")
    public String test1(){
        return "hello spring boot";
    }
}
