package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsSku
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_sku", schema = "", catalog = "wholesale")
public class HdGoodsSku {
    private int gsId;
    private String gsSn;
    private Integer goodsId;
    private Double extraPrice;
    private Integer goodsStore;
    private String gsName;
    private String gsString;
    private String createTime;

    @Id
    @Column(name = "gs_id", nullable = false, insertable = true, updatable = true)
    public int getGsId() {
        return gsId;
    }

    public void setGsId(int gsId) {
        this.gsId = gsId;
    }

    @Basic
    @Column(name = "gs_sn", nullable = true, insertable = true, updatable = true, length = 32)
    public String getGsSn() {
        return gsSn;
    }

    public void setGsSn(String gsSn) {
        this.gsSn = gsSn;
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
    @Column(name = "extra_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(Double extraPrice) {
        this.extraPrice = extraPrice;
    }

    @Basic
    @Column(name = "goods_store", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsStore() {
        return goodsStore;
    }

    public void setGoodsStore(Integer goodsStore) {
        this.goodsStore = goodsStore;
    }

    @Basic
    @Column(name = "gs_name", nullable = true, insertable = true, updatable = true, length = 32)
    public String getGsName() {
        return gsName;
    }

    public void setGsName(String gsName) {
        this.gsName = gsName;
    }

    @Basic
    @Column(name = "gs_string", nullable = true, insertable = true, updatable = true, length = 255)
    public String getGsString() {
        return gsString;
    }

    public void setGsString(String gsString) {
        this.gsString = gsString;
    }

    @Basic
    @Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsSku that = (HdGoodsSku) o;

        if (gsId != that.gsId) return false;
        if (gsSn != null ? !gsSn.equals(that.gsSn) : that.gsSn != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (extraPrice != null ? !extraPrice.equals(that.extraPrice) : that.extraPrice != null) return false;
        if (goodsStore != null ? !goodsStore.equals(that.goodsStore) : that.goodsStore != null) return false;
        if (gsName != null ? !gsName.equals(that.gsName) : that.gsName != null) return false;
        if (gsString != null ? !gsString.equals(that.gsString) : that.gsString != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gsId;
        result = 31 * result + (gsSn != null ? gsSn.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (extraPrice != null ? extraPrice.hashCode() : 0);
        result = 31 * result + (goodsStore != null ? goodsStore.hashCode() : 0);
        result = 31 * result + (gsName != null ? gsName.hashCode() : 0);
        result = 31 * result + (gsString != null ? gsString.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
