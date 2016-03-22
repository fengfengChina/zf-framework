package com.zf.controller;

import com.zf.base.Response;
import com.zf.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AreaController
 *
 * @author zf
 * @date 16/3/19
 */
@RestController
@RequestMapping("/app/area")
public class AreaController {
    @Autowired
    AreaService areaService;

    /**
     * 查询根据城市查询城市
     * @param city_id
     * @return
     */
    @RequestMapping("findById/{city_id}")
    public Object getAreaByCity(@PathVariable Integer city_id){
        return new Response().success(areaService.findAreaByCityId(city_id));
    }

    /**
     * 查找全部地区
     * @return
     */
    @RequestMapping("/findAll")
    public Object findAll(){
        return new Response().success(areaService.findAll());
    }
}
