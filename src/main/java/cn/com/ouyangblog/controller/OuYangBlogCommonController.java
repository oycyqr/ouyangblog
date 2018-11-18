package cn.com.ouyangblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author oyc
 * @Title: OuYangBlogCommonController
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/17 12:45
 */
@Controller
public class OuYangBlogCommonController {

    @GetMapping("/")
    public String index() {
        return "/home";
    }
    @GetMapping("/{page}")
    public String page(@PathVariable String page) {
        return "/"+page;
    }
}