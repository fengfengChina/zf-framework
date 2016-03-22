package com.zf.domian;

import javax.persistence.*;

/**
 * HdBrand
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_brand", schema = "", catalog = "wholesale")
public class HdBrand {
    private int brandId;
    private Integer gtId;
    private String gtIdPath;
    private String brandName;
    private String brandLogo;
    private String brandDesc;
    private String createTime;

    @Id
    @Column(name = "brand_id", nullable = false, insertable = true, updatable = true)
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "gt_id", nullable = true, insertable = true, updatable = true)
    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    @Basic
    @Column(name = "gt_id_path", nullable = true, insertable = true, updatable = true, length = 255)
    public String getGtIdPath() {
        return gtIdPath;
    }

    public void setGtIdPath(String gtIdPath) {
        this.gtIdPath = gtIdPath;
    }

    @Basic
    @Column(name = "brand_name", nullable = true, insertable = true, updatable = true, length = 32)
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "brand_logo", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    @Basic
    @Column(name = "brand_desc", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
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

        HdBrand hdBrand = (HdBrand) o;

        if (brandId != hdBrand.brandId) return false;
        if (gtId != null ? !gtId.equals(hdBrand.gtId) : hdBrand.gtId != null) return false;
        if (gtIdPath != null ? !gtIdPath.equals(hdBrand.gtIdPath) : hdBrand.gtIdPath != null) return false;
        if (brandName != null ? !brandName.equals(hdBrand.brandName) : hdBrand.brandName != null) return false;
        if (brandLogo != null ? !brandLogo.equals(hdBrand.brandLogo) : hdBrand.brandLogo != null) return false;
        if (brandDesc != null ? !brandDesc.equals(hdBrand.brandDesc) : hdBrand.brandDesc != null) return false;
        if (createTime != null ? !createTime.equals(hdBrand.createTime) : hdBrand.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brandId;
        result = 31 * result + (gtId != null ? gtId.hashCode() : 0);
        result = 31 * result + (gtIdPath != null ? gtIdPath.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (brandLogo != null ? brandLogo.hashCode() : 0);
        result = 31 * result + (brandDesc != null ? brandDesc.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
