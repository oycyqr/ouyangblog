package cn.com.ouyangblog.controller;

import cn.com.ouyangblog.domain.OuYangUser;
import cn.com.ouyangblog.repository.OuYangUserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author oyc
 * @Title: OuYangUserController
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/15 21:41
 */
@Api(value = "用户模块")
@Controller
@RequestMapping("/user")
public class OuYangUserController {

    @Resource
    private OuYangUserRepository ouYangUserRepository;

    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<OuYangUser> userList = ouYangUserRepository.findAll();
        model.addAttribute("userList", userList);
        return "pages/userList";
    }

}
