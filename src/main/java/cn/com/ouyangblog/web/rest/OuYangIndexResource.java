package cn.com.ouyangblog.web.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oyc
 * @Title: OuYangCommonResource
 * @ProjectName ouyangblog
 * @Description: 首页控制器
 * @date 2018/11/19 21:46
 */
@Controller
@RequestMapping("api/index")
public class OuYangIndexResource {

    @ApiOperation(value = "登录接口", notes = "登录接口")
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @ApiOperation(value = "首页控制器 vueTest接口", notes = "首页控制器 vueTest接口")
    @GetMapping("/vueTest")
    public String vueTest() {
        return "/vueTest";
    }

    @ApiOperation(value = "首页控制器 vueTest接口", notes = "首页控制器 vueTest接口")
    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @ApiOperation(value = "首页控制器 page接口", notes = "首页控制器 page接口")
    @GetMapping("/pages/{page}")
    public String pages(@PathVariable String page) {
        return "/pages/" + page;
    }
}
