package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsType
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_type", schema = "", catalog = "wholesale")
public class HdGoodsType {
    private int gtId;
    private String gtName;
    private Integer parentId;
    private String idPath;
    private Integer gtOrder;
    private String gtImg;
    private Integer gtLevel;
    private String isShow;

    @Id
    @Column(name = "gt_id", nullable = false, insertable = true, updatable = true)
    public int getGtId() {
        return gtId;
    }

    public void setGtId(int gtId) {
        this.gtId = gtId;
    }

    @Basic
    @Column(name = "gt_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, insertable = true, updatable = true)
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "id_path", nullable = true, insertable = true, updatable = true, length = 255)
    public String getIdPath() {
        return idPath;
    }

    public void setIdPath(String idPath) {
        this.idPath = idPath;
    }

    @Basic
    @Column(name = "gt_order", nullable = true, insertable = true, updatable = true)
    public Integer getGtOrder() {
        return gtOrder;
    }

    public void setGtOrder(Integer gtOrder) {
        this.gtOrder = gtOrder;
    }

    @Basic
    @Column(name = "gt_img", nullable = true, insertable = true, updatable = true, length = 255)
    public String getGtImg() {
        return gtImg;
    }

    public void setGtImg(String gtImg) {
        this.gtImg = gtImg;
    }

    @Basic
    @Column(name = "gt_level", nullable = true, insertable = true, updatable = true)
    public Integer getGtLevel() {
        return gtLevel;
    }

    public void setGtLevel(Integer gtLevel) {
        this.gtLevel = gtLevel;
    }

    @Basic
    @Column(name = "is_show", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsType that = (HdGoodsType) o;

        if (gtId != that.gtId) return false;
        if (gtName != null ? !gtName.equals(that.gtName) : that.gtName != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (idPath != null ? !idPath.equals(that.idPath) : that.idPath != null) return false;
        if (gtOrder != null ? !gtOrder.equals(that.gtOrder) : that.gtOrder != null) return false;
        if (gtImg != null ? !gtImg.equals(that.gtImg) : that.gtImg != null) return false;
        if (gtLevel != null ? !gtLevel.equals(that.gtLevel) : that.gtLevel != null) return false;
        if (isShow != null ? !isShow.equals(that.isShow) : that.isShow != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gtId;
        result = 31 * result + (gtName != null ? gtName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (idPath != null ? idPath.hashCode() : 0);
        result = 31 * result + (gtOrder != null ? gtOrder.hashCode() : 0);
        result = 31 * result + (gtImg != null ? gtImg.hashCode() : 0);
        result = 31 * result + (gtLevel != null ? gtLevel.hashCode() : 0);
        result = 31 * result + (isShow != null ? isShow.hashCode() : 0);
        return result;
    }
}
