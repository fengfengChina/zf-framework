package com.zf.controller;

import com.zf.base.Response;
import com.zf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HdArticle
 *
 * @author zf
 * @date 16/3/19
 */
@RestController
@RequestMapping("/app/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 分页显示文章
     */
    @RequestMapping("/articleList/{pageNum}/{pageSize}")
    public Object articleList( @PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return new Response().success(articleService.findArticleList(pageNum , pageSize));
    }

    /**
     * 查看文章详情
     */
    @RequestMapping("/articleInfo/{article_id}")
    public Object articleInfo(@PathVariable Integer article_id ){
        return new Response().success(articleService.findByArticleId(article_id));
    }

    /**
     * 根据分类查询文章类型
     */
    @RequestMapping("/articleTypeList/{at_id}")
    public Object articleTypeList(@PathVariable Integer at_id ){
        return new Response().success(articleService.articleTypeList(at_id));
    }


}
