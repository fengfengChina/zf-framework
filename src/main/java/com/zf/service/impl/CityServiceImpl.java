package com.zf.service.impl;

import com.zf.dao.CityRepository;
import com.zf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * City
 *
 * @author zf
 * @date 16/3/8
 */
@Transactional
@Component("cityService")
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;

    /**
     * 根据省份查找城市
     * @param
     * @return
     */
    @Override
    public Object findCityByProvince(int provinceId) {
        return cityRepository.findByProvinceIdOrderByCityIdAsc(provinceId);
    }

}
