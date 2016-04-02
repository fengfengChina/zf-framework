package com.zf.domian;

import javax.persistence.*;
import java.io.Serializable;

/**
 * HdGoodsImg
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_img", schema = "", catalog = "wholesale")
public class HdGoodsImg implements Serializable{
    private int giId;


    private Integer goodsId;
    private String imgUrl;
    private Integer imgWidth;
    private Integer imgHeight;
    private String thumbUrl;
    private Integer thumbWidth;
    private Integer thumbHeight;
    private Integer imgOrder;

    @Id
    @Column(name = "gi_id", nullable = false, insertable = true, updatable = true)
    public int getGiId() {
        return giId;
    }

    public void setGiId(int giId) {
        this.giId = giId;
    }
    @Id
    @Column(name = "goods_id", nullable = false, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "img_url", nullable = true, insertable = true, updatable = true, length = 255)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "img_width", nullable = true, insertable = true, updatable = true)
    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    @Basic
    @Column(name = "img_height", nullable = true, insertable = true, updatable = true)
    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    @Basic
    @Column(name = "thumb_url", nullable = true, insertable = true, updatable = true, length = 255)
    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    @Basic
    @Column(name = "thumb_width", nullable = true, insertable = true, updatable = true)
    public Integer getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    @Basic
    @Column(name = "thumb_height", nullable = true, insertable = true, updatable = true)
    public Integer getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    @Basic
    @Column(name = "img_order", nullable = true, insertable = true, updatable = true)
    public Integer getImgOrder() {
        return imgOrder;
    }

    public void setImgOrder(Integer imgOrder) {
        this.imgOrder = imgOrder;
    }
}
