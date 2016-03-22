package com.zf.dao;

import com.zf.domian.HdGoods;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * GoodsRepository
 *
 * @author zf
 * @date 16/3/12
 */
public interface GoodsRepository extends PagingAndSortingRepository<HdGoods,Integer> {
     HdGoods findByGoodsId(Integer id);

}
