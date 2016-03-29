package com.zf.domian;

import javax.persistence.*;

/**
 * HdGoodsComment
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_goods_comment", schema = "", catalog = "wholesale")
public class HdGoodsComment {
    private int gcId;
    private Integer goodsId;
    private Integer userId;
    private String comment;
    private String commentType;
    private String commentTime;
    private String replyName;
    private Integer replyComment;

    @Id
    @Column(name = "gc_id", nullable = false, insertable = true, updatable = true)
    public int getGcId() {
        return gcId;
    }

    public void setGcId(int gcId) {
        this.gcId = gcId;
    }
    @Basic
    @Column(name = "comment_time", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    @Basic
    @Column(name = "reply_name", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }
    @Basic
    @Column(name = "reply_comment", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public Integer getReplyComment() {
        return replyComment;
    }

    public void setReplyComment(Integer replyComment) {
        this.replyComment = replyComment;
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
    @Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "comment", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "comment_type", nullable = true, insertable = true, updatable = true, length = 10)
    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HdGoodsComment)) return false;

        HdGoodsComment that = (HdGoodsComment) o;

        if (getGcId() != that.getGcId()) return false;
        if (getGoodsId() != null ? !getGoodsId().equals(that.getGoodsId()) : that.getGoodsId() != null) return false;
        if (getUserId() != null ? !getUserId().equals(that.getUserId()) : that.getUserId() != null) return false;
        if (getComment() != null ? !getComment().equals(that.getComment()) : that.getComment() != null) return false;
        if (getCommentType() != null ? !getCommentType().equals(that.getCommentType()) : that.getCommentType() != null)
            return false;
        if (getCommentTime() != null ? !getCommentTime().equals(that.getCommentTime()) : that.getCommentTime() != null)
            return false;
        if (getReplyName() != null ? !getReplyName().equals(that.getReplyName()) : that.getReplyName() != null)
            return false;
        return !(getReplyComment() != null ? !getReplyComment().equals(that.getReplyComment()) : that.getReplyComment() != null);

    }

    @Override
    public int hashCode() {
        int result = getGcId();
        result = 31 * result + (getGoodsId() != null ? getGoodsId().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getComment() != null ? getComment().hashCode() : 0);
        result = 31 * result + (getCommentType() != null ? getCommentType().hashCode() : 0);
        result = 31 * result + (getCommentTime() != null ? getCommentTime().hashCode() : 0);
        result = 31 * result + (getReplyName() != null ? getReplyName().hashCode() : 0);
        result = 31 * result + (getReplyComment() != null ? getReplyComment().hashCode() : 0);
        return result;
    }
}
