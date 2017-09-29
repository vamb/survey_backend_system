package com.suyang.model;

import java.util.Date;

public class LibRecord {
    private Long userId;

    private Long bookId;

    private Long adminId;

    private String opertionType;

    private Date opertionTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getOpertionType() {
        return opertionType;
    }

    public void setOpertionType(String opertionType) {
        this.opertionType = opertionType == null ? null : opertionType.trim();
    }

    public Date getOpertionTime() {
        return opertionTime;
    }

    public void setOpertionTime(Date opertionTime) {
        this.opertionTime = opertionTime;
    }
}