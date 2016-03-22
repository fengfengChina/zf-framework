package com.zf.domian;

import javax.persistence.*;

/**
 * HdAd
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_ad", schema = "", catalog = "wholesale")
public class HdAd {
    private int adId;
    private String adPosition;
    private String adType;
    private String adName;
    private String createTime;
    private String isShow;
    private String adImg;
    private Integer linkId;

    @Id
    @Column(name = "ad_id", nullable = false, insertable = true, updatable = true)
    public int getAdId() {
        return adId;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    @Basic
    @Column(name = "ad_position", nullable = true, insertable = true, updatable = true, length = 10)
    public String getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(String adPosition) {
        this.adPosition = adPosition;
    }

    @Basic
    @Column(name = "ad_type", nullable = true, insertable = true, updatable = true, length = 10)
    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    @Basic
    @Column(name = "ad_name", nullable = true, insertable = true, updatable = true, length = 60)
    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    @Basic
    @Column(name = "create_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "is_show", nullable = true, insertable = true, updatable = true, length = 5)
    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    @Basic
    @Column(name = "ad_img", nullable = true, insertable = true, updatable = true, length = 255)
    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    @Basic
    @Column(name = "link_id", nullable = true, insertable = true, updatable = true)
    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdAd hdAd = (HdAd) o;

        if (adId != hdAd.adId) return false;
        if (adPosition != null ? !adPosition.equals(hdAd.adPosition) : hdAd.adPosition != null) return false;
        if (adType != null ? !adType.equals(hdAd.adType) : hdAd.adType != null) return false;
        if (adName != null ? !adName.equals(hdAd.adName) : hdAd.adName != null) return false;
        if (createTime != null ? !createTime.equals(hdAd.createTime) : hdAd.createTime != null) return false;
        if (isShow != null ? !isShow.equals(hdAd.isShow) : hdAd.isShow != null) return false;
        if (adImg != null ? !adImg.equals(hdAd.adImg) : hdAd.adImg != null) return false;
        if (linkId != null ? !linkId.equals(hdAd.linkId) : hdAd.linkId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adId;
        result = 31 * result + (adPosition != null ? adPosition.hashCode() : 0);
        result = 31 * result + (adType != null ? adType.hashCode() : 0);
        result = 31 * result + (adName != null ? adName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isShow != null ? isShow.hashCode() : 0);
        result = 31 * result + (adImg != null ? adImg.hashCode() : 0);
        result = 31 * result + (linkId != null ? linkId.hashCode() : 0);
        return result;
    }
}
