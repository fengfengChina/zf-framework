package com.zf.controller;

import com.zf.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CityController
 *
 * @author zf
 * @date 16/3/18
 */
@RestController()
@RequestMapping(value ="/api" )
public class CityController {

    @Autowired
    CityService cityService;

    /**
     * 根据省份查城市s
     *
     * @return
     */
    @RequestMapping(value = "/getCity")
    public Object getGoodsList(@RequestParam int province_id){
        return cityService.findCityByProvince(province_id);
    }

}
