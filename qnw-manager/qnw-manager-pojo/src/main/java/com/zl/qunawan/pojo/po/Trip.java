package com.zl.qunawan.pojo.po;

public class Trip {
    private Integer id;

    private Integer num;

    private String title;

    private String sTitle;

    private Integer startPlace;

    private Integer positionId;

    private Integer type;

    private String traffic;

    private String hotel;

    private Integer time;

    private Float goodRate;

    private Float placeScore;

    private Float hotelScore;

    private Float serviceScore;

    private Float trafficScore;

    private Boolean isOk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public Integer getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(Integer startPlace) {
        this.startPlace = startPlace;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel == null ? null : hotel.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Float getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(Float goodRate) {
        this.goodRate = goodRate;
    }

    public Float getPlaceScore() {
        return placeScore;
    }

    public void setPlaceScore(Float placeScore) {
        this.placeScore = placeScore;
    }

    public Float getHotelScore() {
        return hotelScore;
    }

    public void setHotelScore(Float hotelScore) {
        this.hotelScore = hotelScore;
    }

    public Float getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Float serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Float getTrafficScore() {
        return trafficScore;
    }

    public void setTrafficScore(Float trafficScore) {
        this.trafficScore = trafficScore;
    }

    public Boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(Boolean isOk) {
        this.isOk = isOk;
    }
}