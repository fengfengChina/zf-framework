package com.zf.controller;

import com.zf.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BrandController
 *
 * @author zf
 * @date 16/3/20
 */
@RestController
@RequestMapping("/app/brand")
public class BrandController {
    @Autowired
    BrandService brandService;

    /**
     * 文章类型列表
     * @return
     */
    @RequestMapping("/brandList")
    public Object getArticleList() {
        return  brandService.findAll();
    }

    /**
     * 根据goodsId 查品牌
     * @param gt_id
     * @return
     */
    @RequestMapping("/brandByGtId/{gt_id}")
    public Object findByGtId(@PathVariable Integer gt_id){
        return brandService.findByGtId(gt_id);
    }
}
