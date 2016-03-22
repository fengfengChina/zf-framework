package com.zf.domian;

import javax.persistence.*;

/**
 * HdUnit
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_unit", schema = "", catalog = "wholesale")
public class HdUnit {
    private int unitId;
    private String unitName;

    @Id
    @Column(name = "unit_id", nullable = false, insertable = true, updatable = true)
    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    @Basic
    @Column(name = "unit_name", nullable = true, insertable = true, updatable = true, length = 32)
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUnit hdUnit = (HdUnit) o;

        if (unitId != hdUnit.unitId) return false;
        if (unitName != null ? !unitName.equals(hdUnit.unitName) : hdUnit.unitName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = unitId;
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        return result;
    }
}
