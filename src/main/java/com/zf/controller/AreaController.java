package com.zf.controller;

import com.zf.base.Response;
import com.zf.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * AreaController
 *
 * @author zf
 * @date 16/3/19
 */
@RestController
@RequestMapping("/api")
public class AreaController {
    @Autowired
    AreaService areaService;

    /**
     * 获取县区数据
     * @param city_id
     * @return
     */
    @RequestMapping("/getArea")
    public Object getAreaByCity(@RequestParam Integer city_id){
        return new Response().success(areaService.findAreaByCityId(city_id));
    }

}