package com.zf.service.impl;

import com.zf.dao.BrandRepository;
import com.zf.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;

/**
 * BrandService
 *
 * @author zf
 * @date 16/3/20
 */
@Component("BrandService")
@Transactional
public class BrandServiceImpl implements BrandService{
    @Autowired
    BrandRepository brandRepository;

    @Override
    public Object findAll() {
        return brandRepository.findAll();
    }

    /**
     * 根据商品id 查询所有brand_id
     * @param gt_id
     * @return
     */
    @Override
    public Object findByGtId(Integer gt_id) {
        return brandRepository.findByGtIdOrderByBrandIdDesc(gt_id);
    }

}
