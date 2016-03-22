package com.zf.domian;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * HdOrder
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_order", schema = "", catalog = "wholesale")
public class HdOrder {
    private int orderId;

    @Id
    @javax.persistence.Column(name = "order_id", nullable = false, insertable = true, updatable = true)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    private String orderSn;

    @Basic
    @javax.persistence.Column(name = "order_sn", nullable = true, insertable = true, updatable = true, length = 32)
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    private Integer userId;

    @Basic
    @javax.persistence.Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer orderStatus;

    @Basic
    @javax.persistence.Column(name = "order_status", nullable = true, insertable = true, updatable = true)
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    private Integer uadId;

    @Basic
    @javax.persistence.Column(name = "uad_id", nullable = true, insertable = true, updatable = true)
    public Integer getUadId() {
        return uadId;
    }

    public void setUadId(Integer uadId) {
        this.uadId = uadId;
    }

    private String address;

    @Basic
    @javax.persistence.Column(name = "address", nullable = true, insertable = true, updatable = true, length = 500)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String postcode;

    @Basic
    @javax.persistence.Column(name = "postcode", nullable = true, insertable = true, updatable = true, length = 6)
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private String receiver;

    @Basic
    @javax.persistence.Column(name = "receiver", nullable = true, insertable = true, updatable = true, length = 16)
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    private String receiverPhone;

    @Basic
    @javax.persistence.Column(name = "receiver_phone", nullable = true, insertable = true, updatable = true, length = 20)
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "remark", nullable = true, insertable = true, updatable = true, length = 255)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Integer scId;

    @Basic
    @javax.persistence.Column(name = "sc_id", nullable = true, insertable = true, updatable = true)
    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    private String scName;

    @Basic
    @javax.persistence.Column(name = "sc_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    private Integer pcId;

    @Basic
    @javax.persistence.Column(name = "pc_id", nullable = true, insertable = true, updatable = true)
    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    private String pcName;

    @Basic
    @javax.persistence.Column(name = "pc_name", nullable = true, insertable = true, updatable = true, length = 20)
    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    private String isSplit;

    @Basic
    @javax.persistence.Column(name = "is_split", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(String isSplit) {
        this.isSplit = isSplit;
    }

    private String invoiceTitle;

    @Basic
    @javax.persistence.Column(name = "invoice_title", nullable = true, insertable = true, updatable = true, length = 120)
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    private Double goodsAmount;

    @Basic
    @javax.persistence.Column(name = "goods_amount", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Double goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    private Double shippingPrice;

    @Basic
    @javax.persistence.Column(name = "shipping_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    private Double actualPrice;

    @Basic
    @javax.persistence.Column(name = "actual_price", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    private Integer pointPay;

    @Basic
    @javax.persistence.Column(name = "point_pay", nullable = true, insertable = true, updatable = true)
    public Integer getPointPay() {
        return pointPay;
    }

    public void setPointPay(Integer pointPay) {
        this.pointPay = pointPay;
    }

    private Double pointMoney;

    @Basic
    @javax.persistence.Column(name = "point_money", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getPointMoney() {
        return pointMoney;
    }

    public void setPointMoney(Double pointMoney) {
        this.pointMoney = pointMoney;
    }

    private Double orderAmount;

    @Basic
    @javax.persistence.Column(name = "order_amount", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    private String orderSource;

    @Basic
    @javax.persistence.Column(name = "order_source", nullable = true, insertable = true, updatable = true, length = 10)
    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    private Double tax;

    @Basic
    @javax.persistence.Column(name = "tax", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    private Double discount;

    @Basic
    @javax.persistence.Column(name = "discount", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    private String createTime;

    @Basic
    @javax.persistence.Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
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

        HdOrder hdOrder = (HdOrder) o;

        if (orderId != hdOrder.orderId) return false;
        if (orderSn != null ? !orderSn.equals(hdOrder.orderSn) : hdOrder.orderSn != null) return false;
        if (userId != null ? !userId.equals(hdOrder.userId) : hdOrder.userId != null) return false;
        if (orderStatus != null ? !orderStatus.equals(hdOrder.orderStatus) : hdOrder.orderStatus != null) return false;
        if (uadId != null ? !uadId.equals(hdOrder.uadId) : hdOrder.uadId != null) return false;
        if (address != null ? !address.equals(hdOrder.address) : hdOrder.address != null) return false;
        if (postcode != null ? !postcode.equals(hdOrder.postcode) : hdOrder.postcode != null) return false;
        if (receiver != null ? !receiver.equals(hdOrder.receiver) : hdOrder.receiver != null) return false;
        if (receiverPhone != null ? !receiverPhone.equals(hdOrder.receiverPhone) : hdOrder.receiverPhone != null)
            return false;
        if (remark != null ? !remark.equals(hdOrder.remark) : hdOrder.remark != null) return false;
        if (scId != null ? !scId.equals(hdOrder.scId) : hdOrder.scId != null) return false;
        if (scName != null ? !scName.equals(hdOrder.scName) : hdOrder.scName != null) return false;
        if (pcId != null ? !pcId.equals(hdOrder.pcId) : hdOrder.pcId != null) return false;
        if (pcName != null ? !pcName.equals(hdOrder.pcName) : hdOrder.pcName != null) return false;
        if (isSplit != null ? !isSplit.equals(hdOrder.isSplit) : hdOrder.isSplit != null) return false;
        if (invoiceTitle != null ? !invoiceTitle.equals(hdOrder.invoiceTitle) : hdOrder.invoiceTitle != null)
            return false;
        if (goodsAmount != null ? !goodsAmount.equals(hdOrder.goodsAmount) : hdOrder.goodsAmount != null) return false;
        if (shippingPrice != null ? !shippingPrice.equals(hdOrder.shippingPrice) : hdOrder.shippingPrice != null)
            return false;
        if (actualPrice != null ? !actualPrice.equals(hdOrder.actualPrice) : hdOrder.actualPrice != null) return false;
        if (pointPay != null ? !pointPay.equals(hdOrder.pointPay) : hdOrder.pointPay != null) return false;
        if (pointMoney != null ? !pointMoney.equals(hdOrder.pointMoney) : hdOrder.pointMoney != null) return false;
        if (orderAmount != null ? !orderAmount.equals(hdOrder.orderAmount) : hdOrder.orderAmount != null) return false;
        if (orderSource != null ? !orderSource.equals(hdOrder.orderSource) : hdOrder.orderSource != null) return false;
        if (tax != null ? !tax.equals(hdOrder.tax) : hdOrder.tax != null) return false;
        if (discount != null ? !discount.equals(hdOrder.discount) : hdOrder.discount != null) return false;
        if (createTime != null ? !createTime.equals(hdOrder.createTime) : hdOrder.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderSn != null ? orderSn.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (uadId != null ? uadId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (scId != null ? scId.hashCode() : 0);
        result = 31 * result + (scName != null ? scName.hashCode() : 0);
        result = 31 * result + (pcId != null ? pcId.hashCode() : 0);
        result = 31 * result + (pcName != null ? pcName.hashCode() : 0);
        result = 31 * result + (isSplit != null ? isSplit.hashCode() : 0);
        result = 31 * result + (invoiceTitle != null ? invoiceTitle.hashCode() : 0);
        result = 31 * result + (goodsAmount != null ? goodsAmount.hashCode() : 0);
        result = 31 * result + (shippingPrice != null ? shippingPrice.hashCode() : 0);
        result = 31 * result + (actualPrice != null ? actualPrice.hashCode() : 0);
        result = 31 * result + (pointPay != null ? pointPay.hashCode() : 0);
        result = 31 * result + (pointMoney != null ? pointMoney.hashCode() : 0);
        result = 31 * result + (orderAmount != null ? orderAmount.hashCode() : 0);
        result = 31 * result + (orderSource != null ? orderSource.hashCode() : 0);
        result = 31 * result + (tax != null ? tax.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
