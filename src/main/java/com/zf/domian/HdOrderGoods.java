package com.zf.domian;

import javax.persistence.*;

/**
 * HdOrderGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_order_goods", schema = "", catalog = "wholesale")
public class HdOrderGoods {
    private int ogId;
    private Integer orderId;
    private Integer goodsId;
    private String goodsName;
    private String goodsSn;
    private Integer goodsNumber;
    private Double marketPrice;
    private Double standardPrice;
    private Integer gaId;
    private String gaName;
    private Double extraPrice;
    private String createTime;

    @Id
    @Column(name = "og_id", nullable = false, insertable = true, updatable = true)
    public int getOgId() {
        return ogId;
    }

    public void setOgId(int ogId) {
        this.ogId = ogId;
    }

    @Basic
    @Column(name = "order_id", nullable = true, insertable = true, updatable = true)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
    @Column(name = "goods_name", nullable = true, insertable = true, updatable = true, length = 120)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_sn", nullable = true, insertable = true, updatable = true, length = 32)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "goods_number", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "market_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
    @Column(name = "standard_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Double standardPrice) {
        this.standardPrice = standardPrice;
    }

    @Basic
    @Column(name = "ga_id", nullable = true, insertable = true, updatable = true)
    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    @Basic
    @Column(name = "ga_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGaName() {
        return gaName;
    }

    public void setGaName(String gaName) {
        this.gaName = gaName;
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

        HdOrderGoods that = (HdOrderGoods) o;

        if (ogId != that.ogId) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsSn != null ? !goodsSn.equals(that.goodsSn) : that.goodsSn != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(that.goodsNumber) : that.goodsNumber != null) return false;
        if (marketPrice != null ? !marketPrice.equals(that.marketPrice) : that.marketPrice != null) return false;
        if (standardPrice != null ? !standardPrice.equals(that.standardPrice) : that.standardPrice != null)
            return false;
        if (gaId != null ? !gaId.equals(that.gaId) : that.gaId != null) return false;
        if (gaName != null ? !gaName.equals(that.gaName) : that.gaName != null) return false;
        if (extraPrice != null ? !extraPrice.equals(that.extraPrice) : that.extraPrice != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ogId;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (standardPrice != null ? standardPrice.hashCode() : 0);
        result = 31 * result + (gaId != null ? gaId.hashCode() : 0);
        result = 31 * result + (gaName != null ? gaName.hashCode() : 0);
        result = 31 * result + (extraPrice != null ? extraPrice.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
