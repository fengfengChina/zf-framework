package com.zf.dao;

import com.zf.domian.HdProvince;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ProvinceRes
 *
 * @author zf
 * @date 16/3/19
 */
public interface ProvinceRepository  extends CrudRepository<HdProvince,Integer> {

}
