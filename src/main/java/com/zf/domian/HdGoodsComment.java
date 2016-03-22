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
    private String gcReply;
    private Integer replyUserId;

    @Id
    @Column(name = "gc_id", nullable = false, insertable = true, updatable = true)
    public int getGcId() {
        return gcId;
    }

    public void setGcId(int gcId) {
        this.gcId = gcId;
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

    @Basic
    @Column(name = "gc_reply", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getGcReply() {
        return gcReply;
    }

    public void setGcReply(String gcReply) {
        this.gcReply = gcReply;
    }

    @Basic
    @Column(name = "reply_user_id", nullable = true, insertable = true, updatable = true)
    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdGoodsComment that = (HdGoodsComment) o;

        if (gcId != that.gcId) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (commentType != null ? !commentType.equals(that.commentType) : that.commentType != null) return false;
        if (gcReply != null ? !gcReply.equals(that.gcReply) : that.gcReply != null) return false;
        if (replyUserId != null ? !replyUserId.equals(that.replyUserId) : that.replyUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gcId;
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (commentType != null ? commentType.hashCode() : 0);
        result = 31 * result + (gcReply != null ? gcReply.hashCode() : 0);
        result = 31 * result + (replyUserId != null ? replyUserId.hashCode() : 0);
        return result;
    }
}
