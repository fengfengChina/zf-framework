package com.zf.dao;

import com.zf.domian.HdArticle;
import com.zf.domian.HdBrand;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * AreaRepository
 *
 * @author zf
 * @date 16/3/19
 */
public interface BrandRepository extends PagingAndSortingRepository<HdBrand, Integer> {

    Object findByGtIdOrderByBrandIdDesc(Integer gt_id);
}
