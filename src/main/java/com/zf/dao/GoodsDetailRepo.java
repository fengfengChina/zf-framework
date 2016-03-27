package com.zf.dao;

import com.zf.domian.HdGoodsDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * GoodsDetailRepo
 *
 * @author zf
 * @date 16/3/27
 */
public interface GoodsDetailRepo extends PagingAndSortingRepository<HdGoodsDetail,Integer>{

    HdGoodsDetail findByGoodsId(Integer goods_id);
}
