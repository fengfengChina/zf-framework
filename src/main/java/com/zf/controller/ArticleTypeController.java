package com.zf.controller;

import com.zf.service.ArticleService;
import com.zf.service.ArticleTypeService;
import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ArticleTypeController
 *
 * @author zf
 * @date 16/3/20
 */
@RestController
@RequestMapping("/api/articleType")
public class ArticleTypeController {
    @Autowired
    ArticleTypeService articleTypeService;

    /**
     * 文章类型列表
     * @return
     */
    @RequestMapping("/articleList")
    public Object getArticleList() {

        return articleTypeService.findAll();
    }
}
