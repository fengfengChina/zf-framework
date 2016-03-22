package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserStatistics
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_statistics", schema = "", catalog = "wholesale")
public class HdUserStatistics {
    private int usId;
    private String ip;
    private Integer userId;
    private String ipProvince;
    private String ipCity;
    private String ipTime;

    @Id
    @Column(name = "us_id", nullable = false, insertable = true, updatable = true)
    public int getUsId() {
        return usId;
    }

    public void setUsId(int usId) {
        this.usId = usId;
    }

    @Basic
    @Column(name = "ip", nullable = true, insertable = true, updatable = true, length = 15)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
    @Column(name = "ip_province", nullable = true, insertable = true, updatable = true, length = 10)
    public String getIpProvince() {
        return ipProvince;
    }

    public void setIpProvince(String ipProvince) {
        this.ipProvince = ipProvince;
    }

    @Basic
    @Column(name = "ip_city", nullable = true, insertable = true, updatable = true, length = 10)
    public String getIpCity() {
        return ipCity;
    }

    public void setIpCity(String ipCity) {
        this.ipCity = ipCity;
    }

    @Basic
    @Column(name = "ip_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getIpTime() {
        return ipTime;
    }

    public void setIpTime(String ipTime) {
        this.ipTime = ipTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserStatistics that = (HdUserStatistics) o;

        if (usId != that.usId) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (ipProvince != null ? !ipProvince.equals(that.ipProvince) : that.ipProvince != null) return false;
        if (ipCity != null ? !ipCity.equals(that.ipCity) : that.ipCity != null) return false;
        if (ipTime != null ? !ipTime.equals(that.ipTime) : that.ipTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usId;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (ipProvince != null ? ipProvince.hashCode() : 0);
        result = 31 * result + (ipCity != null ? ipCity.hashCode() : 0);
        result = 31 * result + (ipTime != null ? ipTime.hashCode() : 0);
        return result;
    }
}
