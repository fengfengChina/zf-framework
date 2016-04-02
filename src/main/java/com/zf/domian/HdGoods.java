package com.zf.domian;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * HdGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_goods", schema = "", catalog = "wholesale")
public class HdGoods implements Serializable{

    private Integer goodsId;

    @Id
    @javax.persistence.Column(name = "goods_id", nullable = false, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    private Set<HdGoodsImg> goodsImgs;

    public HdGoods() {
        goodsImgs = new HashSet<>();
    }



    @OneToMany(mappedBy = "goodsId",targetEntity = HdGoodsImg.class,cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.EXTRA)
    public Set<HdGoodsImg> getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(Set<HdGoodsImg> goodsImgs) {
        this.goodsImgs = goodsImgs;
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

}
