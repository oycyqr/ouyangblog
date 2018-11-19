package cn.com.ouyangblog.web.rest;

import cn.com.ouyangblog.domain.OuYangUser;
import cn.com.ouyangblog.repository.OuYangUserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author oyc
 * @Title: OuYangUserResource
 * @ProjectName ouyangblog
 * @Description: TODO
 * @date 2018/11/19 21:50
 */
@RestController
@RequestMapping("/api/user")
public class OuYangUserResource {

    @Resource
    private OuYangUserRepository ouYangUserRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<Map<String,Object>>> hostTotal() throws Exception {
        List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
        Map<String,Object> temp = new HashMap<String,Object>();
        List<OuYangUser> userList = ouYangUserRepository.findAll();
        temp.put("total",userList.size());
        temp.put("userList",userList);
        result.add(temp);
        return ResponseEntity.ok(result);
    }
}
