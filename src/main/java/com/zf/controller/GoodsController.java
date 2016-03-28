package com.zf.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zf.base.Response;
import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsComment;
import com.zf.domian.HdGoodsParameter;
import com.zf.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.security.oauth2.common.util.Jackson2JsonParser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
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
        System.out.print("pageNum ->" + pageNum +" "+ "pageSize->" + pageSize);
        Response response = new Response().success(goodsService.getGoods(new QPageRequest(pageNum - 1, pageSize)).getContent());
        return response;
    }

    /**
     * getShopGoods 获取商品信息
     *
     * @return
     */
    @RequestMapping(value = "getGoodsInfo")
    public Object getGoodsInfo(@RequestParam(value = "goods_id") Integer goods_id) throws Exception {
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
    public Object getGoodsParam(@RequestParam(value = "goods_id")Integer goods_id) throws Exception {
        List<HdGoodsParameter> goodsParam = goodsService.getGoodsParam(goods_id);
        return new Response().success(goodsParam);

    }

    /**
     * 获取商品详细
     * @return
     */
    @RequestMapping(value = "getGoodsDetail", method = RequestMethod.POST)
    @ResponseBody
    public Object getGoodsDetail(@RequestParam(value = "goods_id") Integer goods_id) throws Exception {
        return new Response().success(goodsService.getGoodsDetail(goods_id));
    }

    /**
     * 获取商品评论
     *
     * @return
     */
    @RequestMapping(value = "getGoodsComment", method = RequestMethod.POST)
    @ResponseBody
    public Object getGoodsComment(@RequestParam(value = "goods_id") Integer goods_id,@RequestParam(value = "pageNum") Integer pageNum, @RequestParam Integer pageSize) throws Exception {
        return new Response().success(goodsService.getGoodsComment(goods_id,pageNum,pageSize));
    }

    /**
     * 批量评论商品
     */
    @RequestMapping(value = "/commentGoodses", method = RequestMethod.POST)
    @ResponseBody
    public Object commentGoodses(@RequestParam(value = "goodsComments") String comments) throws Exception {
        ArrayList<HdGoodsComment> comments1 = new ObjectMapper().readValue(comments, new TypeReference<ArrayList<HdGoodsComment>>(){});
        return new Response().success(goodsService.commentGoodses(comments1));
    }
}
