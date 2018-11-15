package cn.com.ouyangblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oyc
 * @Title: oa
 * @ProjectName ouyangblog
 * @Description: 首页控制器
 * @date 2018/11/12 22:10
 */
@Controller
@RequestMapping("index")
public class OuYangBlogIndexController {

    @RequestMapping("/index")
    public String helloWorld() {
        return "index";
    }
}
