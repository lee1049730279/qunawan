package com.zl.qunawan.pojo.po;

import java.util.Date;

public class Comment {
    private Integer id;

    private Integer userId;

    private Integer tripId;

    private Integer ordersId;

    private Integer placeId;

    private Integer hotel;

    private Integer service;

    private Integer traffic;

    private String content;

    private Date time;

    private Integer usefull;

    private Integer useless;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public Integer getService() {
        return service;
    }

    public void setService(Integer service) {
        this.service = service;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUsefull() {
        return usefull;
    }

    public void setUsefull(Integer usefull) {
        this.usefull = usefull;
    }

    public Integer getUseless() {
        return useless;
    }

    public void setUseless(Integer useless) {
        this.useless = useless;
    }
}