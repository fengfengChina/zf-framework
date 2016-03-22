package com.zf.service.impl;

import com.zf.dao.GoodsRepository;
import com.zf.domian.HdGoods;
import com.zf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * GoodsServiceImpl
 *
 * @author zf
 * @date 16/3/12
 */
@Component("goodsService")
@Transactional
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Page<HdGoods> getGoods(Pageable pageable) {
        return goodsRepository.findAll(pageable);
    }

    @Override
    public HdGoods getGoodsInfoById(Integer id) {
        return goodsRepository.findByGoodsId(id);
    }

    @Override
    public Page<HdGoods> getSearchGoods(String keyword) {
//        return goodsRepository.find;
        return null;
    }


}
