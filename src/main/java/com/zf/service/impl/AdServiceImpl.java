package com.zf.service.impl;

import com.zf.dao.AdRepository;
import com.zf.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * AdServiceImpl
 *
 * @author zf
 * @date 16/3/19
 */
@Component("adService")
@Transactional
public class AdServiceImpl implements AdService {
    @Autowired
    AdRepository adRepository;

    @Override
    public Object getAppAb() {
        return adRepository.findByAdPositionAndIsShow("app",String.valueOf(true));
    }
}
