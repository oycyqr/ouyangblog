package cn.com.ouyangblog.repository;

import cn.com.ouyangblog.domain.OuYangUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: oyc
 * @Date: 2018/12/31 13:24
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OuYangUserRepositoryTest {

    @Autowired
    private OuYangUserRepository repository;

    @Test
    public void testList() {
        List<OuYangUser> list = repository.findAll();
        for (OuYangUser user : list) {
            System.out.println(user.toString());
        }
    }
}