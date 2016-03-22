package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserBalance
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_balance", schema = "", catalog = "wholesale")
public class HdUserBalance {
    private int ubId;
    private Integer userId;
    private Double lastBalance;
    private Double interest;
    private Double annualRate;
    private String createTime;

    @Id
    @Column(name = "ub_id", nullable = false, insertable = true, updatable = true)
    public int getUbId() {
        return ubId;
    }

    public void setUbId(int ubId) {
        this.ubId = ubId;
    }

    @Basic
    @Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "last_balance", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(Double lastBalance) {
        this.lastBalance = lastBalance;
    }

    @Basic
    @Column(name = "interest", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "annual_rate", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(Double annualRate) {
        this.annualRate = annualRate;
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

        HdUserBalance that = (HdUserBalance) o;

        if (ubId != that.ubId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (lastBalance != null ? !lastBalance.equals(that.lastBalance) : that.lastBalance != null) return false;
        if (interest != null ? !interest.equals(that.interest) : that.interest != null) return false;
        if (annualRate != null ? !annualRate.equals(that.annualRate) : that.annualRate != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ubId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (lastBalance != null ? lastBalance.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (annualRate != null ? annualRate.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
