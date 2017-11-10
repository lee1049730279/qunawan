package com.zl.qunawan.pojo.po;

public class Traffic {
    private Integer id;

    private String goPoint;

    private String goTime;

    private String returnPoint;

    private String returnTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getReturnPoint() {
        return returnPoint;
    }

    public void setReturnPoint(String returnPoint) {
        this.returnPoint = returnPoint == null ? null : returnPoint.trim();
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime == null ? null : returnTime.trim();
    }
}