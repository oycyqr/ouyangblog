package cn.com.ouyangblog.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: oyc
 * @Date: 2018/12/25 19:39
 * @Description: 博客文章实体类
 * indexName代表所以名称,type代表表名称
 */
@Data
@Document(indexName = "article", type = "article")
public class OuYangBlogArticle implements Serializable {

    @Id
    private Integer id;
    private String title;
    private Date createTime;
    private String summary;
    private String content;

    protected OuYangBlogArticle() {
    }

    public OuYangBlogArticle(Integer id, String title, Date createTime, String summary, String content) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.summary = summary;
        this.content = content;
    }

    @Override
    public String toString() {
        return "OuYangBlogArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}