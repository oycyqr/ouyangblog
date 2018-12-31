package cn.com.ouyangblog.repository;

import cn.com.ouyangblog.domain.OuYangBlogArticle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author: oyc
 * @Date: 2018/12/31 14:41
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OuYangBlogArticleRepositoryTest {

    @Resource
    private OuYangBlogArticleRepository repository;

    @Before
    public void before() {
        repository.deleteAll();
        OuYangBlogArticle blog1 = new OuYangBlogArticle(1, "1title", new Date(), "11summary", "1content1");
        OuYangBlogArticle blog2 = new OuYangBlogArticle(2, "2title", new Date(), "22summary", "2content2");
        OuYangBlogArticle blog3 = new OuYangBlogArticle(3, "3title", new Date(), "33summary", "3content3");
        repository.save(blog1);
        repository.save(blog2);
        repository.save(blog3);
    }


    @Test
    public void testfindDistinctOuYangBlogArticleByTitleContainingOrSummaryContainingOrContentContaining() {
        String title = "1";
        String summary = "1";
        String content = "1";
        Pageable pageable = new PageRequest(0, 10);
        Page<OuYangBlogArticle> all = (Page<OuYangBlogArticle>) repository.findAll();
        Page<OuYangBlogArticle> page = repository.findDistinctOuYangBlogArticleByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        for (OuYangBlogArticle article : page.getContent()) {
            System.out.println(article.toString());
        }
    }
}