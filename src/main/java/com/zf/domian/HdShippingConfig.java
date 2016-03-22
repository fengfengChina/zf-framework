package com.zf.domian;

import javax.persistence.*;

/**
 * HdShippingConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_shipping_config", schema = "", catalog = "wholesale")
public class HdShippingConfig {
    private int scId;
    private String scCode;
    private String scName;
    private Integer scOrder;
    private String scConfig;
    private String enabled;

    @Id
    @Column(name = "sc_id", nullable = false, insertable = true, updatable = true)
    public int getScId() {
        return scId;
    }

    public void setScId(int scId) {
        this.scId = scId;
    }

    @Basic
    @Column(name = "sc_code", nullable = true, insertable = true, updatable = true, length = 32)
    public String getScCode() {
        return scCode;
    }

    public void setScCode(String scCode) {
        this.scCode = scCode;
    }

    @Basic
    @Column(name = "sc_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    @Basic
    @Column(name = "sc_order", nullable = true, insertable = true, updatable = true)
    public Integer getScOrder() {
        return scOrder;
    }

    public void setScOrder(Integer scOrder) {
        this.scOrder = scOrder;
    }

    @Basic
    @Column(name = "sc_config", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getScConfig() {
        return scConfig;
    }

    public void setScConfig(String scConfig) {
        this.scConfig = scConfig;
    }

    @Basic
    @Column(name = "enabled", nullable = true, insertable = true, updatable = true, length = 5)
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdShippingConfig that = (HdShippingConfig) o;

        if (scId != that.scId) return false;
        if (scCode != null ? !scCode.equals(that.scCode) : that.scCode != null) return false;
        if (scName != null ? !scName.equals(that.scName) : that.scName != null) return false;
        if (scOrder != null ? !scOrder.equals(that.scOrder) : that.scOrder != null) return false;
        if (scConfig != null ? !scConfig.equals(that.scConfig) : that.scConfig != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scId;
        result = 31 * result + (scCode != null ? scCode.hashCode() : 0);
        result = 31 * result + (scName != null ? scName.hashCode() : 0);
        result = 31 * result + (scOrder != null ? scOrder.hashCode() : 0);
        result = 31 * result + (scConfig != null ? scConfig.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
