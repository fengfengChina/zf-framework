package com.zf.domian;

import javax.persistence.*;

/**
 * HdUserLevel
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_user_level", schema = "", catalog = "wholesale")
public class HdUserLevel {
    private int ulId;
    private String ulName;
    private Integer levelConfig;

    @Id
    @Column(name = "ul_id", nullable = false, insertable = true, updatable = true)
    public int getUlId() {
        return ulId;
    }

    public void setUlId(int ulId) {
        this.ulId = ulId;
    }

    @Basic
    @Column(name = "ul_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getUlName() {
        return ulName;
    }

    public void setUlName(String ulName) {
        this.ulName = ulName;
    }

    @Basic
    @Column(name = "level_config", nullable = true, insertable = true, updatable = true)
    public Integer getLevelConfig() {
        return levelConfig;
    }

    public void setLevelConfig(Integer levelConfig) {
        this.levelConfig = levelConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUserLevel that = (HdUserLevel) o;

        if (ulId != that.ulId) return false;
        if (ulName != null ? !ulName.equals(that.ulName) : that.ulName != null) return false;
        if (levelConfig != null ? !levelConfig.equals(that.levelConfig) : that.levelConfig != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ulId;
        result = 31 * result + (ulName != null ? ulName.hashCode() : 0);
        result = 31 * result + (levelConfig != null ? levelConfig.hashCode() : 0);
        return result;
    }
}
