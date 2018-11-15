package cn.com.ouyangblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试模板是否可以使用
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("/world")
    public String helloWorld() {
        return "Hello World! This is ouyangcheng's Blog!welcome Here!";
    }

}
