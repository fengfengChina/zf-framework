package com.zf.service;

import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsComment;
import com.zf.domian.HdGoodsParameter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Goods
 *
 * @author zf
 * @date 16/3/8
 */
public interface GoodsService {

    Page<HdGoods> getGoods(Pageable pageable);

    HdGoods getGoodsInfoById(Integer id);

    Page<HdGoods> getSearchGoods(String keyword);

    List<HdGoodsParameter> getGoodsParam(Integer goods_id);

    Object getGoodsDetail(Integer goods_id);


    List<HdGoodsComment> getGoodsComment(Integer pageNum, Integer pageSize, Integer goods_id);

    Object commentGoodses(ArrayList<HdGoodsComment> comments1);
}
