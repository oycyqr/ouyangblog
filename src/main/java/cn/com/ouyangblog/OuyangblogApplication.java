package cn.com.ouyangblog;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication(scanBasePackages = {"cn.com.ouyangblog"})
//该注解包含了@Controller和@ResponseBody两个注解
@RestController
public class OuyangblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(OuyangblogApplication.class, args);
    }

    @ApiOperation(value = "测试post请求",notes="注意事项")
    @ApiImplicitParam(dataType = "User",name = "user",value = "用户信息",required = true)
    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public String testPost(@RequestBody Map map){
        return "success";
    }


    @ApiOperation(value = "测试get请求",notes="注意事项")
    @ApiImplicitParam(name = "id",value = "用户id",dataType = "String",paramType = "path")
    @RequestMapping(value = "/testGet/{id}",method = RequestMethod.GET)
    public String testGet(@PathVariable String id){
        return id;
    }
}
