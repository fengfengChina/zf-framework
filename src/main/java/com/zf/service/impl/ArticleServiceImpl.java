package com.zf.service.impl;

import com.zf.dao.ArticleRepository;
import com.zf.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * ArticleServiceImpl
 * 文章管理服务类
 * @author zf
 * @date 16/3/19
 */
@Component("articleService")
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    /**
     * 查询文章id文章详情
     * @param articleId
     * @return
     */
    @Override
    public Object findByArticleId(Integer articleId) {
        return articleRepository.findByArticleId(articleId);
    }

    /**
     * 查询列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public Object findArticleList(Integer pageNum, Integer pageSize) {
        return articleRepository.findAll(new QPageRequest(pageNum,pageSize)).getContent();
    }


    /**
     * 根据文章类型.
     * @param at_id
     * @return
     */
    @Override
    public Object articleTypeList(Integer at_id) {
        return articleRepository.findByAtId(at_id);
    }
}
