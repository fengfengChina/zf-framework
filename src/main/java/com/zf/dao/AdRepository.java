package com.zf.dao;

import com.zf.domian.HdAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * CityRes
 *
 * @author zf
 * @date 16/3/18
 */
public interface AdRepository extends JpaRepository<HdAd, Integer>, JpaSpecificationExecutor<HdAd> {

    List<HdAd> findByAdPositionAndIsShow(String position,String is_show);

}
