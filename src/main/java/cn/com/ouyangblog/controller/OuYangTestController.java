package cn.com.ouyangblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: oyc
 * @Date: 2018/11/16 16:02
 * @Description:OuYangTestController
 */
@RestController
@RequestMapping("api")
public class OuYangTestController {

    @RequestMapping("/world")
    public String helloWorld() {
        return "Hello World! This is ouyangcheng's Blog!welcome Here!";
    }
}