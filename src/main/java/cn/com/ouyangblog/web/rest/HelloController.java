package cn.com.ouyangblog.web.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试模板是否可以使用
 */
@Api("测试模板是否可以使用")
@RestController
@RequestMapping("hello")
public class HelloController {

    @ApiOperation(value = "Test Hello World接口", notes = "Test Hello World接口")
    @RequestMapping(value = "/world", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld() {
        return "Hello World! This is ouyangcheng's Blog!welcome Here!";
    }

}
