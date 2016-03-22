package com.zf.dao;

import com.zf.domian.HdArticle;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * AreaRepository
 *
 * @author zf
 * @date 16/3/19
 */
public interface ArticleTypeRepository extends PagingAndSortingRepository<HdArticle, Integer> {

}
