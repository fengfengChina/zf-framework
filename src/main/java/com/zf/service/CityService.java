package com.zf.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * City
 *
 * @author zf
 * @date 16/3/8
 */

public interface CityService {
     Object findCityByProvince(int province_id);
}
