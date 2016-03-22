package com.zf.service;


/**
 * @author zf
 * @date 16/3/8
 */
public interface ArticleService {
    Object findByArticleId(Integer id);

    Object findArticleList(Integer pageNum, Integer pageSize);

    Object articleTypeList(Integer at_id);
}
