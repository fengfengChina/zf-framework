package com.zf.service.impl;

import com.zf.config.SampleUserDetailsService;
import com.zf.dao.GoodsCommentRepo;
import com.zf.dao.GoodsDetailRepo;
import com.zf.dao.GoodsParamterRepo;
import com.zf.dao.GoodsRepository;
import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsComment;
import com.zf.domian.HdGoodsParameter;
import com.zf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.*;

/**
 * GoodsServiceImpl
 *
 * @author zf
 * @date 16/3/12
 */
@Component("goodsService")
@Transactional
public class GoodsServiceImpl implements GoodsService {
    /** 商品详情*/
    @Autowired
    private GoodsDetailRepo goodsDetailRepo;

    /** 商品*/
    @Autowired
    private GoodsRepository goodsRepository;

    /** 商品评论*/
    @Autowired
    private GoodsCommentRepo goodsCommentRepo;

    /**商品属性*/
    @Autowired
    private GoodsParamterRepo goodsParamterRepo;

    /**获取用户信息的实体*/
    @Autowired private SampleUserDetailsService sampleUserDetailsService;
    @Override
    public Page<HdGoods> getGoods(Pageable pageable) {
        return goodsRepository.findAll(pageable);
    }

    @Override
    public HdGoods getGoodsInfoById(Integer id) {
        return goodsRepository.findByGoodsId(id);
    }

    @Override
    public List<HdGoods> getSearchGoods(String keyword,Integer pageNum, Integer pageSize) {
        return goodsRepository.findByGoodsName(keyword,new PageRequest(pageNum,pageSize));
    }

    @Override
    public List<HdGoodsParameter> getGoodsParam(Integer goods_id) {
        return goodsParamterRepo.findByGoodsIdOrderByGpIdAsc(goods_id);
    }


    @Override
    public Object getGoodsDetail(Integer goods_id) {
        return goodsDetailRepo.findByGoodsId(goods_id);
    }

    @Override
    public List<HdGoodsComment> getGoodsComment(Integer goods_id,Integer pageNum, Integer pageSize) {
        return goodsCommentRepo.findByGoodsIdOrderByGcIdAsc(goods_id, new PageRequest(pageNum - 1, pageSize));
    }

    /**
     * 批量评价商品
     * @param comments
     * @return
     */
    @Override
    public Object commentGoodses(List<HdGoodsComment> comments) {
//        UserDetails userDetails = sampleUserDetailsService.loadUserByUsername(String.valueOf(comments.get(0).getUserId()));
        for (HdGoodsComment comment : comments){
            DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd HH:mm:ss");
            comment.setCommentTime(dateFormatter.print(new Date(), Locale.CHINA));
//            if (userDetails.getUsername()==null){
//                comment.setUserId(0);
//            }else{
                comment.setUserId(0);
//            }
        }
        return goodsCommentRepo.save(comments);
    }


    private Specification<HdGoodsComment> whereSpec(final HdGoodsComment sample) {
        return new Specification<HdGoodsComment>() {
            @Override
            public Predicate toPredicate(Root<HdGoodsComment> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("goods_id"), sample.getGoodsId());
            }
        };
    }
}
