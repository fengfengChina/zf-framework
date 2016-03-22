package com.zf.domian;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * HdGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_goods", schema = "", catalog = "wholesale")
public class HdGoods {
    private Integer goodsId;

    @Id
    @javax.persistence.Column(name = "goods_id", nullable = false, insertable = true, updatable = true)
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    private String goodsSn;

    @Basic
    @javax.persistence.Column(name = "goods_sn", nullable = true, insertable = true, updatable = true, length = 32)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    private String goodsName;

    @Basic
    @javax.persistence.Column(name = "goods_name", nullable = true, insertable = true, updatable = true, length = 120)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    private Integer brandId;

    @Basic
    @javax.persistence.Column(name = "brand_id", nullable = true, insertable = true, updatable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    private Integer shopId;

    @Basic
    @javax.persistence.Column(name = "shop_id", nullable = true, insertable = true, updatable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    private Integer provinceId;

    @Basic
    @javax.persistence.Column(name = "province_id", nullable = true, insertable = true, updatable = true)
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    private String goodsSource;

    @Basic
    @javax.persistence.Column(name = "goods_source", nullable = true, insertable = true, updatable = true, length = 100)
    public String getGoodsSource() {
        return goodsSource;
    }

    public void setGoodsSource(String goodsSource) {
        this.goodsSource = goodsSource;
    }

    private Double marketPrice;

    @Basic
    @javax.persistence.Column(name = "market_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    private Double standardPrice;

    @Basic
    @javax.persistence.Column(name = "standard_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Double standardPrice) {
        this.standardPrice = standardPrice;
    }

    private Integer unitId;

    @Basic
    @javax.persistence.Column(name = "unit_id", nullable = true, insertable = true, updatable = true)
    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    private String isReal;

    @Basic
    @javax.persistence.Column(name = "is_real", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal;
    }

    private String isOnSale;

    @Basic
    @javax.persistence.Column(name = "is_on_sale", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale;
    }

    private Integer goodsPoint;

    @Basic
    @javax.persistence.Column(name = "goods_point", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsPoint() {
        return goodsPoint;
    }

    public void setGoodsPoint(Integer goodsPoint) {
        this.goodsPoint = goodsPoint;
    }

    private String createUser;

    @Basic
    @javax.persistence.Column(name = "create_user", nullable = true, insertable = true, updatable = true, length = 32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    private String createTime;

    @Basic
    @javax.persistence.Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private String updateUser;

    @Basic
    @javax.persistence.Column(name = "update_user", nullable = true, insertable = true, updatable = true, length = 32)
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    private String updateTime;

    @Basic
    @javax.persistence.Column(name = "update_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    private String isDelete;

    @Basic
    @javax.persistence.Column(name = "is_delete", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    private Integer auditStep;

    @Basic
    @javax.persistence.Column(name = "audit_step", nullable = true, insertable = true, updatable = true)
    public Integer getAuditStep() {
        return auditStep;
    }

    public void setAuditStep(Integer auditStep) {
        this.auditStep = auditStep;
    }

    private String auditUser;

    @Basic
    @javax.persistence.Column(name = "audit_user", nullable = true, insertable = true, updatable = true, length = 32)
    public String getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(String auditUser) {
        this.auditUser = auditUser;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "remark", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoods hdGoods = (HdGoods) o;

        if (goodsId != hdGoods.goodsId) return false;
        if (goodsSn != null ? !goodsSn.equals(hdGoods.goodsSn) : hdGoods.goodsSn != null) return false;
        if (goodsName != null ? !goodsName.equals(hdGoods.goodsName) : hdGoods.goodsName != null) return false;
        if (brandId != null ? !brandId.equals(hdGoods.brandId) : hdGoods.brandId != null) return false;
        if (shopId != null ? !shopId.equals(hdGoods.shopId) : hdGoods.shopId != null) return false;
        if (provinceId != null ? !provinceId.equals(hdGoods.provinceId) : hdGoods.provinceId != null) return false;
        if (goodsSource != null ? !goodsSource.equals(hdGoods.goodsSource) : hdGoods.goodsSource != null) return false;
        if (marketPrice != null ? !marketPrice.equals(hdGoods.marketPrice) : hdGoods.marketPrice != null) return false;
        if (standardPrice != null ? !standardPrice.equals(hdGoods.standardPrice) : hdGoods.standardPrice != null)
            return false;
        if (unitId != null ? !unitId.equals(hdGoods.unitId) : hdGoods.unitId != null) return false;
        if (isReal != null ? !isReal.equals(hdGoods.isReal) : hdGoods.isReal != null) return false;
        if (isOnSale != null ? !isOnSale.equals(hdGoods.isOnSale) : hdGoods.isOnSale != null) return false;
        if (goodsPoint != null ? !goodsPoint.equals(hdGoods.goodsPoint) : hdGoods.goodsPoint != null) return false;
        if (createUser != null ? !createUser.equals(hdGoods.createUser) : hdGoods.createUser != null) return false;
        if (createTime != null ? !createTime.equals(hdGoods.createTime) : hdGoods.createTime != null) return false;
        if (updateUser != null ? !updateUser.equals(hdGoods.updateUser) : hdGoods.updateUser != null) return false;
        if (updateTime != null ? !updateTime.equals(hdGoods.updateTime) : hdGoods.updateTime != null) return false;
        if (isDelete != null ? !isDelete.equals(hdGoods.isDelete) : hdGoods.isDelete != null) return false;
        if (auditStep != null ? !auditStep.equals(hdGoods.auditStep) : hdGoods.auditStep != null) return false;
        if (auditUser != null ? !auditUser.equals(hdGoods.auditUser) : hdGoods.auditUser != null) return false;
        if (remark != null ? !remark.equals(hdGoods.remark) : hdGoods.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId;
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (goodsSource != null ? goodsSource.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (standardPrice != null ? standardPrice.hashCode() : 0);
        result = 31 * result + (unitId != null ? unitId.hashCode() : 0);
        result = 31 * result + (isReal != null ? isReal.hashCode() : 0);
        result = 31 * result + (isOnSale != null ? isOnSale.hashCode() : 0);
        result = 31 * result + (goodsPoint != null ? goodsPoint.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        result = 31 * result + (auditStep != null ? auditStep.hashCode() : 0);
        result = 31 * result + (auditUser != null ? auditUser.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
