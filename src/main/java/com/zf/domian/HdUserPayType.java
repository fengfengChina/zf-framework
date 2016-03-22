package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserPayType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_pay_type", schema = "", catalog = "wholesale")
public class HdUserPayType {
    private int uptId;
    private String uptName;

    @Id
    @Column(name = "upt_id", nullable = false, insertable = true, updatable = true)
    public int getUptId() {
        return uptId;
    }

    public void setUptId(int uptId) {
        this.uptId = uptId;
    }

    @Basic
    @Column(name = "upt_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getUptName() {
        return uptName;
    }

    public void setUptName(String uptName) {
        this.uptName = uptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserPayType that = (HdUserPayType) o;

        if (uptId != that.uptId) return false;
        if (uptName != null ? !uptName.equals(that.uptName) : that.uptName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uptId;
        result = 31 * result + (uptName != null ? uptName.hashCode() : 0);
        return result;
    }
}
