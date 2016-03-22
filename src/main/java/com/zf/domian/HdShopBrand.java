package com.zf.domian;

import javax.persistence.*;

/**
 * HdShopBrand
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shop_brand", schema = "", catalog = "wholesale")
public class HdShopBrand {
    private int sbId;
    private Integer shopId;
    private Integer brandId;

    @Id
    @Column(name = "sb_id", nullable = false, insertable = true, updatable = true)
    public int getSbId() {
        return sbId;
    }

    public void setSbId(int sbId) {
        this.sbId = sbId;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, insertable = true, updatable = true)
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "brand_id", nullable = true, insertable = true, updatable = true)
    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShopBrand that = (HdShopBrand) o;

        if (sbId != that.sbId) return false;
        if (shopId != null ? !shopId.equals(that.shopId) : that.shopId != null) return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sbId;
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        return result;
    }
}
