package com.zf.service.impl;

import com.zf.dao.AreaRepository;
import com.zf.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.transaction.Transactional;

/**
 * AreaServiceImpl
 * 区域服务类
 * @author zf
 * @date 16/3/19
 */
@Transactional
@Component("areaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    AreaRepository areaRepository;

    /**
     * 查询地区id通过cityId
     * @param city_id
     * @return
     */
    @Override
    public Object findAreaByCityId(Integer city_id) {
        Assert.notNull(city_id);
        return areaRepository.findByCityIdOrderByAreaIdAsc(city_id);
    }

    /**
     * 查询地区
     * @return
     */
    public Object findAll(){
        return areaRepository.findAll();
    }

}
