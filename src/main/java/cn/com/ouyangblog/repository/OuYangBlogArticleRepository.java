package cn.com.ouyangblog.repository;

import cn.com.ouyangblog.domain.OuYangBlogArticle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Author: oyc
 * @Date: 2018/12/31 14:30
 * @Description:
 */
@Component
public interface OuYangBlogArticleRepository extends ElasticsearchRepository<OuYangBlogArticle, String> {
    /**
     * @param title
     * @param summary
     * @param connent
     * @param pageable
     * @return
     */
    Page<OuYangBlogArticle> findDistinctOuYangBlogArticleByTitleContainingOrSummaryContainingOrContentContaining(String title, String summary, String connent, Pageable pageable);

}