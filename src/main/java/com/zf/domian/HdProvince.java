package com.zf.domian;

import javax.persistence.*;

/**
 * HdProvince
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_province", schema = "", catalog = "wholesale")
public class HdProvince {
    private int provinceId;
    private String provinceName;

    @Id
    @Column(name = "province_id", nullable = false, insertable = true, updatable = true)
    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "province_name", nullable = true, insertable = true, updatable = true, length = 10)
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdProvince that = (HdProvince) o;

        if (provinceId != that.provinceId) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provinceId;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        return result;
    }
}
