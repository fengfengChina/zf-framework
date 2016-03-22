package com.zf.dao;

import com.zf.domian.HdCity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CityRes
 *
 * @author zf
 * @date 16/3/18
 */
public interface CityRepository extends CrudRepository<HdCity, Integer> {
    List<HdCity> findByProvinceIdOrderByCityIdAsc(Integer province_id);

}
