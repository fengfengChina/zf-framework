package com.zf.controller;

import com.zf.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProvinceController
 *
 * @author zf
 * @date 16/3/19
 */
@RestController()
@RequestMapping("/api")
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    /**
     * 获取省份信息
     * @return
     */
    @RequestMapping("/getProvince")
    public Object provinceAll(){
        return provinceService.findProvinceAll();
    }


}
