package com.zf.controller;

import com.zf.base.Response;
import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsParameter;
import com.zf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * GoodsController
 *
 * @author zf
 * @date 16/3/12
 */
@RestController()
@RequestMapping(value ="/app" )
public class GoodsController  {
    @Autowired
    GoodsService goodsService;
    /**
     * getShopGoods 获取商品列表
     *
     * @return
     */
    @RequestMapping(value = "/getGoodsList/{pageNum}/{pageSize}")
    public Object getGoodsList(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return goodsService.getGoods(new QPageRequest(pageNum,pageSize)).getContent();
    }

    /**
     * getShopGoods 获取商品信息
     *
     * @return
     */
    @RequestMapping(value = "getGoodsInfo")
    public Object getGoodsInfo(@RequestParam Integer goods_id) throws Exception {
        HdGoods hdGoods = goodsService.getGoodsInfoById(goods_id);
        return new Response().success(hdGoods);
    }

    /**
     * 获取商品参数
     *
     * @return
     */
    @RequestMapping(value = "getGoodsParam", method = RequestMethod.POST)
    @ResponseBody
    public Object getGoodsParam(@RequestParam Integer goods_id) throws Exception {
        List<HdGoodsParameter> goodsParam = goodsService.getGoodsParam(goods_id);
        return new Response().success(goodsParam);
    }

    /**
     * 获取商品详细
     * @return
     */
    @RequestMapping(value = "getGoodsDetail", method = RequestMethod.POST)
    @ResponseBody
    public Object getGoodsDetail() throws Exception {
//        List<> = goodsService.getGoodsDetail(pd);
//        return AppUtil.returnObject(pd, map);
        return null;
    }

    /**
     * 获取商品评论
     *
     * @return
     */
    @RequestMapping(value = "getGoodsComment", method = RequestMethod.POST)
    @ResponseBody
    public Object getGoodsComment() throws Exception {
//        logBefore(logger, "获取商品评论");
//        PageData pd = this.getPageData();
//        Map<String, Object> map = goodsService.getGoodsComment(pd);
//        return AppUtil.returnObject(pd, map);
        return null;
    }

    /**
     * 批量评论商品
     */
    @RequestMapping(value = "/commentGoodses", method = RequestMethod.POST)
    @ResponseBody
    public Object commentGoodses() throws Exception {
//        logBefore(logger, "批量评论商品");
//        PageData pd = this.getPageData();
//        Map<String, Object> map = goodsService.commentGoodses(pd);
//        return AppUtil.returnObject(pd, map);
        return null;
    }
}
