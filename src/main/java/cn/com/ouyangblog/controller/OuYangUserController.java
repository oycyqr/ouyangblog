package cn.com.ouyangblog.controller;

import cn.com.ouyangblog.domain.OuYangUser;
import cn.com.ouyangblog.repository.OuYangUserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author oyc
 * @Title: OuYangUserController
 * @ProjectName ouyangblog
 * @Description: 用户控制类
 * @date 2018/11/15 21:41
 */
@Api("客服接口")
@Controller
@RequestMapping("user")
public class OuYangUserController {

    @Resource
    private OuYangUserRepository ouYangUserRepository;

    @ApiOperation(value = "添加文章", notes = "添加新的文章", tags = "Article",httpMethod = "POST")
    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<OuYangUser> userList = ouYangUserRepository.findAll();
        model.addAttribute("userList", userList);
        return "userList";
    }

}
