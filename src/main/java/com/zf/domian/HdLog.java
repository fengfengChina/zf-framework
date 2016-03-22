package com.zf.domian;

import javax.persistence.*;

/**
 * HdLog
 *
 * @author zf
 * @date 16/3/12
 */
@Entity
@Table(name = "hd_log", schema = "", catalog = "wholesale")
public class HdLog {
    private int logId;
    private String logTime;
    private String sysUserId;
    private String sysUserName;
    private String logAction;
    private String logParams;
    private String ipAddress;

    @Id
    @Column(name = "log_id", nullable = false, insertable = true, updatable = true)
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "log_time", nullable = true, insertable = true, updatable = true, length = 20)
    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    @Basic
    @Column(name = "sys_user_id", nullable = true, insertable = true, updatable = true, length = 32)
    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    @Basic
    @Column(name = "sys_user_name", nullable = true, insertable = true, updatable = true, length = 100)
    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    @Basic
    @Column(name = "log_action", nullable = true, insertable = true, updatable = true, length = 255)
    public String getLogAction() {
        return logAction;
    }

    public void setLogAction(String logAction) {
        this.logAction = logAction;
    }

    @Basic
    @Column(name = "log_params", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getLogParams() {
        return logParams;
    }

    public void setLogParams(String logParams) {
        this.logParams = logParams;
    }

    @Basic
    @Column(name = "ip_address", nullable = true, insertable = true, updatable = true, length = 15)
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HdLog hdLog = (HdLog) o;

        if (logId != hdLog.logId) return false;
        if (logTime != null ? !logTime.equals(hdLog.logTime) : hdLog.logTime != null) return false;
        if (sysUserId != null ? !sysUserId.equals(hdLog.sysUserId) : hdLog.sysUserId != null) return false;
        if (sysUserName != null ? !sysUserName.equals(hdLog.sysUserName) : hdLog.sysUserName != null) return false;
        if (logAction != null ? !logAction.equals(hdLog.logAction) : hdLog.logAction != null) return false;
        if (logParams != null ? !logParams.equals(hdLog.logParams) : hdLog.logParams != null) return false;
        if (ipAddress != null ? !ipAddress.equals(hdLog.ipAddress) : hdLog.ipAddress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + (logTime != null ? logTime.hashCode() : 0);
        result = 31 * result + (sysUserId != null ? sysUserId.hashCode() : 0);
        result = 31 * result + (sysUserName != null ? sysUserName.hashCode() : 0);
        result = 31 * result + (logAction != null ? logAction.hashCode() : 0);
        result = 31 * result + (logParams != null ? logParams.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        return result;
    }
}
