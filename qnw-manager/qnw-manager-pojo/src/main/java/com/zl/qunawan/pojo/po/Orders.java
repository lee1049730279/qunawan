package com.zl.qunawan.pojo.po;

import java.util.Date;

public class Orders {
    private Integer id;

    private String orderno;

    private Integer tripId;

    private Integer num;

    private Date startTime;

    private String goPoint;

    private String goTime;

    private Float totalPrice;

    private Integer state;

    private Date createTime;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getGoPoint() {
        return goPoint;
    }

    public void setGoPoint(String goPoint) {
        this.goPoint = goPoint == null ? null : goPoint.trim();
    }

    public String getGoTime() {
        return goTime;
    }

    public void setGoTime(String goTime) {
        this.goTime = goTime == null ? null : goTime.trim();
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}