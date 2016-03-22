package com.zf.dao;

import com.zf.domian.HdArea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * AreaRepository
 *
 * @author zf
 * @date 16/3/19
 */
public interface AreaRepository extends CrudRepository<HdArea, Integer>{
    List<HdArea> findByCityIdOrderByAreaIdAsc(Integer cityId);
}
