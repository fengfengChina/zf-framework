package com.zf.dao;

import com.zf.domian.HdGoodsComment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * GoodsCommentRepo
 *
 * @author zf
 * @date 16/3/27
 */
public interface GoodsCommentRepo  extends PagingAndSortingRepository<HdGoodsComment,Integer>{

    Object findByGoods();

    List<HdGoodsComment> findByGoodsId();
}
