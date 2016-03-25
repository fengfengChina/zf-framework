package com.zf.service;

import com.zf.base.CommonInterface;
import com.zf.domian.HdAd;

/**
 * Hd_ad
 *  广告
 * @author zf
 * @date 16/3/8
 */
public interface AdService extends CommonInterface<HdAd>{


    Object getAppAb(String position, String isShow);
}
