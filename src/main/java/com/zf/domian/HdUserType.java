package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_type", schema = "", catalog = "wholesale")
public class HdUserType {
    private int utId;
    private String utName;

    @Id
    @Column(name = "ut_id", nullable = false, insertable = true, updatable = true)
    public int getUtId() {
        return utId;
    }

    public void setUtId(int utId) {
        this.utId = utId;
    }

    @Basic
    @Column(name = "ut_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getUtName() {
        return utName;
    }

    public void setUtName(String utName) {
        this.utName = utName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserType that = (HdUserType) o;

        if (utId != that.utId) return false;
        if (utName != null ? !utName.equals(that.utName) : that.utName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = utId;
        result = 31 * result + (utName != null ? utName.hashCode() : 0);
        return result;
    }
}
