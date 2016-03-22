package com.zf.dao;

import com.zf.domian.HdArea;
import com.zf.domian.HdArticle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * AreaRepository
 *
 * @author zf
 * @date 16/3/19
 */
public interface ArticleRepository extends PagingAndSortingRepository<HdArticle, Integer> {
    HdArticle findByArticleId(Integer cityId);

    List<HdArticle> findByAtId(Integer at_id);

}
