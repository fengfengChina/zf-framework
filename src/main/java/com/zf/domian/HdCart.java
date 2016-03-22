package com.zf.domian;

import javax.persistence.*;

/**
 * HdCart
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_cart", schema = "", catalog = "wholesale")
public class HdCart {
    private int cartId;
    private Integer userId;
    private String sessionId;
    private Integer goodsId;
    private String goodsSn;
    private Integer goodsNumber;
    private Integer gaId;
    private String createTime;

    @Id
    @Column(name = "cart_id", nullable = false, insertable = true, updatable = true)
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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
    @Column(name = "session_id", nullable = true, insertable = true, updatable = true, length = 32)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "goods_id", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_sn", nullable = true, insertable = true, updatable = true, length = 32)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "goods_number", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    @Basic
    @Column(name = "ga_id", nullable = true, insertable = true, updatable = true)
    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
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

        HdCart hdCart = (HdCart) o;

        if (cartId != hdCart.cartId) return false;
        if (userId != null ? !userId.equals(hdCart.userId) : hdCart.userId != null) return false;
        if (sessionId != null ? !sessionId.equals(hdCart.sessionId) : hdCart.sessionId != null) return false;
        if (goodsId != null ? !goodsId.equals(hdCart.goodsId) : hdCart.goodsId != null) return false;
        if (goodsSn != null ? !goodsSn.equals(hdCart.goodsSn) : hdCart.goodsSn != null) return false;
        if (goodsNumber != null ? !goodsNumber.equals(hdCart.goodsNumber) : hdCart.goodsNumber != null) return false;
        if (gaId != null ? !gaId.equals(hdCart.gaId) : hdCart.gaId != null) return false;
        if (createTime != null ? !createTime.equals(hdCart.createTime) : hdCart.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsNumber != null ? goodsNumber.hashCode() : 0);
        result = 31 * result + (gaId != null ? gaId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
