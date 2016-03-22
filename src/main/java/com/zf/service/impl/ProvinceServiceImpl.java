package com.zf.service.impl;

import com.zf.dao.ProvinceRepository;
import com.zf.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * ProvinceServiceImpl
 * 城市服务层
 * @author zf
 * @date 16/3/19
 */
@Transactional
@Component("provinceService")
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    ProvinceRepository provinceRepository;

    /**
     * 查找全部城市
     * @return
     */
    @Override
    public Object findProvinceAll() {
        return provinceRepository.findAll();
    }

}
