package com.zf.domian;

import javax.persistence.*;

/**
 * HdSpecialConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_special_config", schema = "", catalog = "wholesale")
public class HdSpecialConfig {
    private int scId;
    private String scName;

    @Id
    @Column(name = "sc_id", nullable = false, insertable = true, updatable = true)
    public int getScId() {
        return scId;
    }

    public void setScId(int scId) {
        this.scId = scId;
    }

    @Basic
    @Column(name = "sc_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdSpecialConfig that = (HdSpecialConfig) o;

        if (scId != that.scId) return false;
        if (scName != null ? !scName.equals(that.scName) : that.scName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scId;
        result = 31 * result + (scName != null ? scName.hashCode() : 0);
        return result;
    }
}
