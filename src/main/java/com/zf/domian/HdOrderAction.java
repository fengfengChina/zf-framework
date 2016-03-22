package com.zf.domian;

import javax.persistence.*;

/**
 * HdOrderAction
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_order_action", schema = "", catalog = "wholesale")
public class HdOrderAction {
    private int oaId;
    private Integer orderId;
    private Integer oaUser;
    private String oaSysUser;
    private Integer orderStatus;
    private String actionNote;
    private String actionTime;

    @Id
    @Column(name = "oa_id", nullable = false, insertable = true, updatable = true)
    public int getOaId() {
        return oaId;
    }

    public void setOaId(int oaId) {
        this.oaId = oaId;
    }

    @Basic
    @Column(name = "order_id", nullable = true, insertable = true, updatable = true)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "oa_user", nullable = true, insertable = true, updatable = true)
    public Integer getOaUser() {
        return oaUser;
    }

    public void setOaUser(Integer oaUser) {
        this.oaUser = oaUser;
    }

    @Basic
    @Column(name = "oa_sys_user", nullable = true, insertable = true, updatable = true, length = 32)
    public String getOaSysUser() {
        return oaSysUser;
    }

    public void setOaSysUser(String oaSysUser) {
        this.oaSysUser = oaSysUser;
    }

    @Basic
    @Column(name = "order_status", nullable = true, insertable = true, updatable = true)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "action_note", nullable = true, insertable = true, updatable = true, length = 10)
    public String getActionNote() {
        return actionNote;
    }

    public void setActionNote(String actionNote) {
        this.actionNote = actionNote;
    }

    @Basic
    @Column(name = "action_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdOrderAction that = (HdOrderAction) o;

        if (oaId != that.oaId) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (oaUser != null ? !oaUser.equals(that.oaUser) : that.oaUser != null) return false;
        if (oaSysUser != null ? !oaSysUser.equals(that.oaSysUser) : that.oaSysUser != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (actionNote != null ? !actionNote.equals(that.actionNote) : that.actionNote != null) return false;
        if (actionTime != null ? !actionTime.equals(that.actionTime) : that.actionTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oaId;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (oaUser != null ? oaUser.hashCode() : 0);
        result = 31 * result + (oaSysUser != null ? oaSysUser.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (actionNote != null ? actionNote.hashCode() : 0);
        result = 31 * result + (actionTime != null ? actionTime.hashCode() : 0);
        return result;
    }
}
