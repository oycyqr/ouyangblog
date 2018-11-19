package cn.com.ouyangblog.web.rest;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author oyc
 * @Title: OuYangCommonResource
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/19 21:46
 */
@RestController
public class OuYangCommonResource {

    @ApiOperation(value = "首页控制器 index接口", notes = "首页控制器 index接口")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "/index";
    }
}
