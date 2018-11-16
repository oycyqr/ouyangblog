package cn.com.ouyangblog.controller;

import cn.com.ouyangblog.domain.OuYangUser;
import cn.com.ouyangblog.repository.OuYangUserRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oyc
 * @Title: OuYangUserController
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/15 21:41
 */
@Controller
@RequestMapping("user")
public class OuYangUserController {

    @Resource
    private OuYangUserRepository ouYangUserRepository;

    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<OuYangUser> userList = ouYangUserRepository.findAll();
        model.addAttribute("userList", userList);
        return "userList";
    }

}
