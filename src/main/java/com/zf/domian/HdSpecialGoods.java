package com.zf.domian;

import javax.persistence.*;

/**
 * HdSpecialGoods
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_special_goods", schema = "", catalog = "wholesale")
public class HdSpecialGoods {
    private int sgId;
    private Integer scId;
    private Integer goodsId;

    @Id
    @Column(name = "sg_id", nullable = false, insertable = true, updatable = true)
    public int getSgId() {
        return sgId;
    }

    public void setSgId(int sgId) {
        this.sgId = sgId;
    }

    @Basic
    @Column(name = "sc_id", nullable = true, insertable = true, updatable = true)
    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    @Basic
    @Column(name = "goods_id", nullable = true, insertable = true, updatable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdSpecialGoods that = (HdSpecialGoods) o;

        if (sgId != that.sgId) return false;
        if (scId != null ? !scId.equals(that.scId) : that.scId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sgId;
        result = 31 * result + (scId != null ? scId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        return result;
    }
}
