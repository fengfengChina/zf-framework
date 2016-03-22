package com.zf.service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * HdArea
 * 地区
 * @author zf
 * @date 16/3/8
 */
public interface AreaService {

    Object findAreaByCityId(Integer city_id);
    Object findAll();
}
