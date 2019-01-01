package cn.com.ouyangblog.web.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oyc
 * @Title: OuYangCommonResource
 * @ProjectName ouyangblog
 * @Description: 首页控制器
 * @date 2018/11/19 21:46
 */
@Controller
@RequestMapping("api/admin")
public class OuYangAdminResource {

    @ApiOperation(value = "管理页面", notes = "管理页面")
    @GetMapping("/admin")
    public String login() {
        return "/admin/admin";
    }


}
