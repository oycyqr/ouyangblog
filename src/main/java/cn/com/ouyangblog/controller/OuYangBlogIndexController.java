package cn.com.ouyangblog.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author oyc
 * @Title: oa
 * @ProjectName ouyangblog
 * @Description: 首页控制器
 * @date 2018/11/12 22:10
 */
@Controller
@RequestMapping("index")
@Api("首页控制器")
public class OuYangBlogIndexController {


    @ApiOperation(value = "首页控制器 index接口", notes = "首页控制器 index接口")
    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld() {
        return "index";
    }
}
