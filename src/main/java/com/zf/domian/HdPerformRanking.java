package com.zf.domian;

import javax.persistence.*;

/**
 * HdPerformRanking
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_perform_ranking", schema = "", catalog = "wholesale")
public class HdPerformRanking {
    private int prId;
    private Integer userId;
    private Double totalSales;
    private Integer prRanking;
    private String rankingType;
    private String createTime;

    @Id
    @Column(name = "pr_id", nullable = false, insertable = true, updatable = true)
    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
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
    @Column(name = "total_sales", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    @Basic
    @Column(name = "pr_ranking", nullable = true, insertable = true, updatable = true)
    public Integer getPrRanking() {
        return prRanking;
    }

    public void setPrRanking(Integer prRanking) {
        this.prRanking = prRanking;
    }

    @Basic
    @Column(name = "ranking_type", nullable = true, insertable = true, updatable = true, length = 10)
    public String getRankingType() {
        return rankingType;
    }

    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
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

        HdPerformRanking that = (HdPerformRanking) o;

        if (prId != that.prId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (totalSales != null ? !totalSales.equals(that.totalSales) : that.totalSales != null) return false;
        if (prRanking != null ? !prRanking.equals(that.prRanking) : that.prRanking != null) return false;
        if (rankingType != null ? !rankingType.equals(that.rankingType) : that.rankingType != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = prId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (totalSales != null ? totalSales.hashCode() : 0);
        result = 31 * result + (prRanking != null ? prRanking.hashCode() : 0);
        result = 31 * result + (rankingType != null ? rankingType.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
