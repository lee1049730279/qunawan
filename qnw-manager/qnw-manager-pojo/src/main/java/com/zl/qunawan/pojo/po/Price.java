package com.zl.qunawan.pojo.po;

import java.util.Date;

public class Price {
    private Integer id;

    private Date date;

    private Integer trip;

    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTrip() {
        return trip;
    }

    public void setTrip(Integer trip) {
        this.trip = trip;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}