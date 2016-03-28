package com.zf.service.impl;

import com.zf.base.CommonInterface;
import com.zf.dao.GoodsCommentRepo;
import com.zf.dao.GoodsDetailRepo;
import com.zf.dao.GoodsRepository;
import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsComment;
import com.zf.domian.HdGoodsParameter;
import com.zf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * GoodsServiceImpl
 *
 * @author zf
 * @date 16/3/12
 */
@Component("goodsService")
@Transactional
public class GoodsServiceImpl implements GoodsService ,CommonInterface<HdGoodsComment> {
    @Autowired
    private GoodsDetailRepo goodsDetailRepo;
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private GoodsCommentRepo goodsCommentRepo;
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
        return null;
    }


    @Override
    public Object getGoodsDetail(Integer goods_id) {
        return goodsDetailRepo.findByGoodsId(goods_id);
    }

    @Override
    public List<HdGoodsComment> getGoodsComment(Integer pageNum, Integer pageSize,Integer goods_id) {
        HdGoodsComment hdGoodsComment = new HdGoodsComment();
        hdGoodsComment.setGoodsId(goods_id);
        return findBySample(hdGoodsComment,new PageRequest(pageNum,pageSize)).getContent();

    }

    @Override
    public Object commentGoodses(ArrayList<HdGoodsComment> comments1) {
//        return findBySample(new HdGoodsComment().setGoodsId(););
        return null;
    }


    @Override
    public HdGoodsComment findById(Integer id) {
        return goodsCommentRepo.findOne(id);
    }

    @Override
    public HdGoodsComment findBySample(HdGoodsComment sample) {
        return null;
    }

    @Override
    public List<HdGoodsComment> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<HdGoodsComment> findBySample(HdGoodsComment sample, Sort sort) {
        return null;
    }

    @Override
    public Page<HdGoodsComment> findBySample(HdGoodsComment sample, PageRequest pageRequest) {
        return null;
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
