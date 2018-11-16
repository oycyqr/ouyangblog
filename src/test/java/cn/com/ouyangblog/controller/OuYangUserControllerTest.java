package cn.com.ouyangblog.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.Model;

import javax.annotation.Resource;

/**
 * @Auther: oyc
 * @Date: 2018/11/16 11:40
 * @Description:用户测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OuYangUserControllerTest {

    @Resource
    private OuYangUserController controller;

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        request = new MockHttpServletRequest();
    }

    @Test
    public void list(){
       // controller.list(request,response);
    }
}