package com.zf.domian;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * HdUsers
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@javax.persistence.Table(name = "hd_users", schema = "", catalog = "wholesale")
public class HdUsers {
    private int userId;


    @Id
    @javax.persistence.Column(name = "user_id", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private String userName;

    @Basic
    @javax.persistence.Column(name = "user_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String realName;

    @Basic
    @javax.persistence.Column(name = "real_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    private String nickName;

    @Basic
    @javax.persistence.Column(name = "nick_name", nullable = true, insertable = true, updatable = true, length = 16)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password", nullable = true, insertable = true, updatable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email", nullable = true, insertable = true, updatable = true, length = 60)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String sex;

    @Basic
    @javax.persistence.Column(name = "sex", nullable = true, insertable = true, updatable = true, length = 6)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String birthday;

    @Basic
    @javax.persistence.Column(name = "birthday", nullable = true, insertable = true, updatable = true, length = 10)
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String officePhone;

    @Basic
    @javax.persistence.Column(name = "office_phone", nullable = true, insertable = true, updatable = true, length = 20)
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    private String mobilePhone;

    @Basic
    @javax.persistence.Column(name = "mobile_phone", nullable = true, insertable = true, updatable = true, length = 20)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    private String regTime;

    @Basic
    @javax.persistence.Column(name = "reg_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    private String lastLogin;

    @Basic
    @javax.persistence.Column(name = "last_login", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    private String lastIp;

    @Basic
    @javax.persistence.Column(name = "last_ip", nullable = true, insertable = true, updatable = true, length = 15)
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    private String qq;

    @Basic
    @javax.persistence.Column(name = "qq", nullable = true, insertable = true, updatable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    private Integer utId;

    @Basic
    @javax.persistence.Column(name = "ut_id", nullable = true, insertable = true, updatable = true)
    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    private Integer uptId;

    @Basic
    @javax.persistence.Column(name = "upt_id", nullable = true, insertable = true, updatable = true)
    public Integer getUptId() {
        return uptId;
    }

    public void setUptId(Integer uptId) {
        this.uptId = uptId;
    }

    private Integer ulId;

    @Basic
    @javax.persistence.Column(name = "ul_id", nullable = true, insertable = true, updatable = true)
    public Integer getUlId() {
        return ulId;
    }

    public void setUlId(Integer ulId) {
        this.ulId = ulId;
    }

    private Integer payPoints;

    @Basic
    @javax.persistence.Column(name = "pay_points", nullable = true, insertable = true, updatable = true)
    public Integer getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(Integer payPoints) {
        this.payPoints = payPoints;
    }

    private Integer levelPoints;

    @Basic
    @javax.persistence.Column(name = "level_points", nullable = true, insertable = true, updatable = true)
    public Integer getLevelPoints() {
        return levelPoints;
    }

    public void setLevelPoints(Integer levelPoints) {
        this.levelPoints = levelPoints;
    }

    private String qqId;

    @Basic
    @javax.persistence.Column(name = "qq_id", nullable = true, insertable = true, updatable = true, length = 32)
    public String getQqId() {
        return qqId;
    }

    public void setQqId(String qqId) {
        this.qqId = qqId;
    }

    private String weixinId;

    @Basic
    @javax.persistence.Column(name = "weixin_id", nullable = true, insertable = true, updatable = true, length = 32)
    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    private String weiboId;

    @Basic
    @javax.persistence.Column(name = "weibo_id", nullable = true, insertable = true, updatable = true, length = 32)
    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }

    private Integer prestoreMoney;

    @Basic
    @javax.persistence.Column(name = "prestore_money", nullable = true, insertable = true, updatable = true)
    public Integer getPrestoreMoney() {
        return prestoreMoney;
    }

    public void setPrestoreMoney(Integer prestoreMoney) {
        this.prestoreMoney = prestoreMoney;
    }

    private Double balanceMoney;

    @Basic
    @javax.persistence.Column(name = "balance_money", nullable = true, insertable = true, updatable = true, precision = 0)
    public Double getBalanceMoney() {
        return balanceMoney;
    }

    public void setBalanceMoney(Double balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    private String userHead;

    @Basic
    @javax.persistence.Column(name = "user_head", nullable = true, insertable = true, updatable = true, length = 255)
    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public HdUsers() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdUsers hdUsers = (HdUsers) o;

        if (userId != hdUsers.userId) return false;
        if (userName != null ? !userName.equals(hdUsers.userName) : hdUsers.userName != null) return false;
        if (realName != null ? !realName.equals(hdUsers.realName) : hdUsers.realName != null) return false;
        if (nickName != null ? !nickName.equals(hdUsers.nickName) : hdUsers.nickName != null) return false;
        if (password != null ? !password.equals(hdUsers.password) : hdUsers.password != null) return false;
        if (email != null ? !email.equals(hdUsers.email) : hdUsers.email != null) return false;
        if (sex != null ? !sex.equals(hdUsers.sex) : hdUsers.sex != null) return false;
        if (birthday != null ? !birthday.equals(hdUsers.birthday) : hdUsers.birthday != null) return false;
        if (officePhone != null ? !officePhone.equals(hdUsers.officePhone) : hdUsers.officePhone != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(hdUsers.mobilePhone) : hdUsers.mobilePhone != null) return false;
        if (regTime != null ? !regTime.equals(hdUsers.regTime) : hdUsers.regTime != null) return false;
        if (lastLogin != null ? !lastLogin.equals(hdUsers.lastLogin) : hdUsers.lastLogin != null) return false;
        if (lastIp != null ? !lastIp.equals(hdUsers.lastIp) : hdUsers.lastIp != null) return false;
        if (qq != null ? !qq.equals(hdUsers.qq) : hdUsers.qq != null) return false;
        if (utId != null ? !utId.equals(hdUsers.utId) : hdUsers.utId != null) return false;
        if (uptId != null ? !uptId.equals(hdUsers.uptId) : hdUsers.uptId != null) return false;
        if (ulId != null ? !ulId.equals(hdUsers.ulId) : hdUsers.ulId != null) return false;
        if (payPoints != null ? !payPoints.equals(hdUsers.payPoints) : hdUsers.payPoints != null) return false;
        if (levelPoints != null ? !levelPoints.equals(hdUsers.levelPoints) : hdUsers.levelPoints != null) return false;
        if (qqId != null ? !qqId.equals(hdUsers.qqId) : hdUsers.qqId != null) return false;
        if (weixinId != null ? !weixinId.equals(hdUsers.weixinId) : hdUsers.weixinId != null) return false;
        if (weiboId != null ? !weiboId.equals(hdUsers.weiboId) : hdUsers.weiboId != null) return false;
        if (prestoreMoney != null ? !prestoreMoney.equals(hdUsers.prestoreMoney) : hdUsers.prestoreMoney != null)
            return false;
        if (balanceMoney != null ? !balanceMoney.equals(hdUsers.balanceMoney) : hdUsers.balanceMoney != null)
            return false;
        if (userHead != null ? !userHead.equals(hdUsers.userHead) : hdUsers.userHead != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (officePhone != null ? officePhone.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (lastIp != null ? lastIp.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (utId != null ? utId.hashCode() : 0);
        result = 31 * result + (uptId != null ? uptId.hashCode() : 0);
        result = 31 * result + (ulId != null ? ulId.hashCode() : 0);
        result = 31 * result + (payPoints != null ? payPoints.hashCode() : 0);
        result = 31 * result + (levelPoints != null ? levelPoints.hashCode() : 0);
        result = 31 * result + (qqId != null ? qqId.hashCode() : 0);
        result = 31 * result + (weixinId != null ? weixinId.hashCode() : 0);
        result = 31 * result + (weiboId != null ? weiboId.hashCode() : 0);
        result = 31 * result + (prestoreMoney != null ? prestoreMoney.hashCode() : 0);
        result = 31 * result + (balanceMoney != null ? balanceMoney.hashCode() : 0);
        result = 31 * result + (userHead != null ? userHead.hashCode() : 0);
        return result;
    }

    public HdUsers(String password, String mobilePhone) {
        this.password = password;
        this.mobilePhone = mobilePhone;
    }
}
