package com.zf.service.impl;

import com.zf.dao.ArticleRepository;
import com.zf.dao.ArticleTypeRepository;
import com.zf.service.ArticleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * ArticleTypeServiceImpl
 *
 * @author zf
 * @date 16/3/20
 */
@Transactional
@Component("articleTypeServiceImpl")
public class ArticleTypeServiceImpl implements ArticleTypeService{
    @Autowired
    ArticleTypeRepository articleTypeRepository;

    @Override
    public Object findAll() {
        return articleTypeRepository.findAll();
    }

}
