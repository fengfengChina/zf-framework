package com.zf.dao;

import com.zf.domian.HdAd;
import com.zf.domian.HdCity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * CityRes
 *
 * @author zf
 * @date 16/3/18
 */
public interface AdRepository extends CrudRepository<HdAd, Integer> {

    List<HdAd> findByAdPositionAndIsShow(String position,String is_show);

}
