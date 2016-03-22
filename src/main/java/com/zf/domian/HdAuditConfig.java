package com.zf.domian;

import javax.persistence.*;

/**
 * HdAuditConfig
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_audit_config", schema = "", catalog = "wholesale")
public class HdAuditConfig {
    private int acId;
    private Integer acStep;
    private String acName;
    private String isCheck;

    @Id
    @Column(name = "ac_id", nullable = false, insertable = true, updatable = true)
    public int getAcId() {
        return acId;
    }

    public void setAcId(int acId) {
        this.acId = acId;
    }

    @Basic
    @Column(name = "ac_step", nullable = true, insertable = true, updatable = true)
    public Integer getAcStep() {
        return acStep;
    }

    public void setAcStep(Integer acStep) {
        this.acStep = acStep;
    }

    @Basic
    @Column(name = "ac_name", nullable = true, insertable = true, updatable = true, length = 32)
    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    @Basic
    @Column(name = "is_check", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdAuditConfig that = (HdAuditConfig) o;

        if (acId != that.acId) return false;
        if (acStep != null ? !acStep.equals(that.acStep) : that.acStep != null) return false;
        if (acName != null ? !acName.equals(that.acName) : that.acName != null) return false;
        if (isCheck != null ? !isCheck.equals(that.isCheck) : that.isCheck != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = acId;
        result = 31 * result + (acStep != null ? acStep.hashCode() : 0);
        result = 31 * result + (acName != null ? acName.hashCode() : 0);
        result = 31 * result + (isCheck != null ? isCheck.hashCode() : 0);
        return result;
    }
}
