package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsImg
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_img", schema = "", catalog = "wholesale")
public class HdGoodsImg {
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

    @Basic
    @Column(name = "goods_id", nullable = true, insertable = true, updatable = true)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsImg that = (HdGoodsImg) o;

        if (giId != that.giId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (imgWidth != null ? !imgWidth.equals(that.imgWidth) : that.imgWidth != null) return false;
        if (imgHeight != null ? !imgHeight.equals(that.imgHeight) : that.imgHeight != null) return false;
        if (thumbUrl != null ? !thumbUrl.equals(that.thumbUrl) : that.thumbUrl != null) return false;
        if (thumbWidth != null ? !thumbWidth.equals(that.thumbWidth) : that.thumbWidth != null) return false;
        if (thumbHeight != null ? !thumbHeight.equals(that.thumbHeight) : that.thumbHeight != null) return false;
        if (imgOrder != null ? !imgOrder.equals(that.imgOrder) : that.imgOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = giId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (imgWidth != null ? imgWidth.hashCode() : 0);
        result = 31 * result + (imgHeight != null ? imgHeight.hashCode() : 0);
        result = 31 * result + (thumbUrl != null ? thumbUrl.hashCode() : 0);
        result = 31 * result + (thumbWidth != null ? thumbWidth.hashCode() : 0);
        result = 31 * result + (thumbHeight != null ? thumbHeight.hashCode() : 0);
        result = 31 * result + (imgOrder != null ? imgOrder.hashCode() : 0);
        return result;
    }
}
