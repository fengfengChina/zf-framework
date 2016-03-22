package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsAttr
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_attr", schema = "", catalog = "wholesale")
public class HdGoodsAttr {
    private int gaId;
    private Integer goodsId;
    private Integer ganId;
    private Integer gavId;
    private String isSku;
    private Integer skuId;
    private String createTime;

    @Id
    @Column(name = "ga_id", nullable = false, insertable = true, updatable = true)
    public int getGaId() {
        return gaId;
    }

    public void setGaId(int gaId) {
        this.gaId = gaId;
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
    @Column(name = "gan_id", nullable = true, insertable = true, updatable = true)
    public Integer getGanId() {
        return ganId;
    }

    public void setGanId(Integer ganId) {
        this.ganId = ganId;
    }

    @Basic
    @Column(name = "gav_id", nullable = true, insertable = true, updatable = true)
    public Integer getGavId() {
        return gavId;
    }

    public void setGavId(Integer gavId) {
        this.gavId = gavId;
    }

    @Basic
    @Column(name = "is_sku", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsSku() {
        return isSku;
    }

    public void setIsSku(String isSku) {
        this.isSku = isSku;
    }

    @Basic
    @Column(name = "sku_id", nullable = true, insertable = true, updatable = true)
    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
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

        HdGoodsAttr that = (HdGoodsAttr) o;

        if (gaId != that.gaId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (ganId != null ? !ganId.equals(that.ganId) : that.ganId != null) return false;
        if (gavId != null ? !gavId.equals(that.gavId) : that.gavId != null) return false;
        if (isSku != null ? !isSku.equals(that.isSku) : that.isSku != null) return false;
        if (skuId != null ? !skuId.equals(that.skuId) : that.skuId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gaId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (ganId != null ? ganId.hashCode() : 0);
        result = 31 * result + (gavId != null ? gavId.hashCode() : 0);
        result = 31 * result + (isSku != null ? isSku.hashCode() : 0);
        result = 31 * result + (skuId != null ? skuId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
