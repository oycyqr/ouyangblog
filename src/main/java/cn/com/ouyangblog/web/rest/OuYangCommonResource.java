package cn.com.ouyangblog.web.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author oyc
 * @Title: OuYangCommonResource
 * @ProjectName ouyangblog
 * @Description:  common 控制器
 * @date 2018/11/19 21:46
 */
@Controller
public class OuYangCommonResource {

    @ApiOperation(value = " common 控制器 index接口", notes = " common 控制器 index接口")
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @ApiOperation(value = "登录接口", notes = "登录接口")
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
