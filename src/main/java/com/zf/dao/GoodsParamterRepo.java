package com.zf.dao;

import com.zf.domian.HdGoodsParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * GoodsParamterRepo
 *
 * @author zf
 * @date 16/3/28
 */
public interface GoodsParamterRepo extends JpaRepository<HdGoodsParameter,Integer> {
    List<HdGoodsParameter> findByGoodsIdOrderByGpIdAsc(Integer goodsId);
}
