package com.zf.dao;

import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsParameter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GoodsRepository
 *
 * @author zf
 * @date 16/3/12
 */
public interface GoodsRepository extends PagingAndSortingRepository<HdGoods,Integer> {
     HdGoods findByGoodsId(Integer id);

     HdGoods findByGoodsName();

}
