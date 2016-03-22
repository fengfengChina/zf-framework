package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsAttrValue
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_attr_value", schema = "", catalog = "wholesale")
public class HdGoodsAttrValue {
    private int gavId;
    private String gavName;
    private Integer ganId;
    private Integer gtId;
    private String gavOrder;
    private String createTime;

    @Id
    @Column(name = "gav_id", nullable = false, insertable = true, updatable = true)
    public int getGavId() {
        return gavId;
    }

    public void setGavId(int gavId) {
        this.gavId = gavId;
    }

    @Basic
    @Column(name = "gav_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getGavName() {
        return gavName;
    }

    public void setGavName(String gavName) {
        this.gavName = gavName;
    }

    @Basic
    @Column(name = "gan_id", nullable = true, insertable = true, updatable = true)
    public Integer getGanId() {
        return ganId;
    }

    public void setGanId(Integer ganId) {
        this.ganId = ganId;
    }

    @Basic
    @Column(name = "gt_id", nullable = true, insertable = true, updatable = true)
    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    @Basic
    @Column(name = "gav_order", nullable = true, insertable = true, updatable = true, length = 255)
    public String getGavOrder() {
        return gavOrder;
    }

    public void setGavOrder(String gavOrder) {
        this.gavOrder = gavOrder;
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

        HdGoodsAttrValue that = (HdGoodsAttrValue) o;

        if (gavId != that.gavId) return false;
        if (gavName != null ? !gavName.equals(that.gavName) : that.gavName != null) return false;
        if (ganId != null ? !ganId.equals(that.ganId) : that.ganId != null) return false;
        if (gtId != null ? !gtId.equals(that.gtId) : that.gtId != null) return false;
        if (gavOrder != null ? !gavOrder.equals(that.gavOrder) : that.gavOrder != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gavId;
        result = 31 * result + (gavName != null ? gavName.hashCode() : 0);
        result = 31 * result + (ganId != null ? ganId.hashCode() : 0);
        result = 31 * result + (gtId != null ? gtId.hashCode() : 0);
        result = 31 * result + (gavOrder != null ? gavOrder.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
