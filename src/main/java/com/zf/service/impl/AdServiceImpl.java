package com.zf.service.impl;

import com.zf.dao.AdRepository;
import com.zf.domian.HdAd;
import com.zf.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * AdServiceImpl
 *
 * @author zf
 * @date 16/3/19
 */
@Component("adService")
@Transactional
public class AdServiceImpl implements AdService {
    @Autowired
    AdRepository adRepository;

    @Override
    public Object getAppAb(String position, String isShow) {

        HdAd hdAd = new HdAd();
        hdAd.setAdPosition(position);
        hdAd.setIsShow(isShow);

        return findBySample(hdAd);

//        return adRepository.findByAdPositionAndIsShow("app", String.valueOf(true));
    }

    @Override
    public HdAd findById(Integer id) {
        return adRepository.findOne(id);
    }

    @Override
    public HdAd findBySample(HdAd sample) {
        return adRepository.findOne(whereSpec(sample));
    }

    @Override
    public List<HdAd> findAll(Sort sort) {
        return adRepository.findAll(sort);
    }

    @Override
    public List<HdAd> findBySample(HdAd sample, Sort sort) {
        return adRepository.findAll(whereSpec(sample), sort);
    }

    @Override
    public Page<HdAd> findBySample(HdAd sample, PageRequest pageRequest) {
        return adRepository.findAll(whereSpec(sample), pageRequest);
    }

    private Specification<HdAd> whereSpec(final HdAd sample) {
        return new Specification<HdAd>() {
            @Override
            public Predicate toPredicate(Root<HdAd> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if (sample.getAdId() > 0) {
                    predicates.add(cb.equal(root.<Integer>get("adId"), sample.getAdId()));
                }
                if (StringUtils.hasLength(sample.getAdPosition())) {
                    predicates.add(cb.equal(root.<String>get("adPosition"), sample.getAdPosition()));
                }
                if (StringUtils.hasLength(sample.getIsShow())) {
                    predicates.add(cb.equal(root.<String>get("isShow"), sample.getIsShow()));
                }

                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
    }
}
