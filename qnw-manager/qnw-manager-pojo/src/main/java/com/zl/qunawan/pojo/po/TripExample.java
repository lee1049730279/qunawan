package com.zl.qunawan.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNull() {
            addCriterion("s_title is null");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNotNull() {
            addCriterion("s_title is not null");
            return (Criteria) this;
        }

        public Criteria andSTitleEqualTo(String value) {
            addCriterion("s_title =", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotEqualTo(String value) {
            addCriterion("s_title <>", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThan(String value) {
            addCriterion("s_title >", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThanOrEqualTo(String value) {
            addCriterion("s_title >=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThan(String value) {
            addCriterion("s_title <", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThanOrEqualTo(String value) {
            addCriterion("s_title <=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLike(String value) {
            addCriterion("s_title like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotLike(String value) {
            addCriterion("s_title not like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleIn(List<String> values) {
            addCriterion("s_title in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotIn(List<String> values) {
            addCriterion("s_title not in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleBetween(String value1, String value2) {
            addCriterion("s_title between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotBetween(String value1, String value2) {
            addCriterion("s_title not between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIsNull() {
            addCriterion("start_place is null");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIsNotNull() {
            addCriterion("start_place is not null");
            return (Criteria) this;
        }

        public Criteria andStartPlaceEqualTo(Integer value) {
            addCriterion("start_place =", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotEqualTo(Integer value) {
            addCriterion("start_place <>", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceGreaterThan(Integer value) {
            addCriterion("start_place >", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_place >=", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceLessThan(Integer value) {
            addCriterion("start_place <", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("start_place <=", value, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceIn(List<Integer> values) {
            addCriterion("start_place in", values, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotIn(List<Integer> values) {
            addCriterion("start_place not in", values, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceBetween(Integer value1, Integer value2) {
            addCriterion("start_place between", value1, value2, "startPlace");
            return (Criteria) this;
        }

        public Criteria andStartPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("start_place not between", value1, value2, "startPlace");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Integer value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Integer value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Integer value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Integer value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Integer> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Integer> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Integer value1, Integer value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNull() {
            addCriterion("traffic is null");
            return (Criteria) this;
        }

        public Criteria andTrafficIsNotNull() {
            addCriterion("traffic is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficEqualTo(String value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(String value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(String value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(String value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(String value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLike(String value) {
            addCriterion("traffic like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotLike(String value) {
            addCriterion("traffic not like", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<String> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<String> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(String value1, String value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(String value1, String value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andHotelIsNull() {
            addCriterion("hotel is null");
            return (Criteria) this;
        }

        public Criteria andHotelIsNotNull() {
            addCriterion("hotel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEqualTo(String value) {
            addCriterion("hotel =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(String value) {
            addCriterion("hotel <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(String value) {
            addCriterion("hotel >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(String value) {
            addCriterion("hotel <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(String value) {
            addCriterion("hotel <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLike(String value) {
            addCriterion("hotel like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotLike(String value) {
            addCriterion("hotel not like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<String> values) {
            addCriterion("hotel in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<String> values) {
            addCriterion("hotel not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(String value1, String value2) {
            addCriterion("hotel between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(String value1, String value2) {
            addCriterion("hotel not between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andGoodRateIsNull() {
            addCriterion("good_rate is null");
            return (Criteria) this;
        }

        public Criteria andGoodRateIsNotNull() {
            addCriterion("good_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGoodRateEqualTo(Float value) {
            addCriterion("good_rate =", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateNotEqualTo(Float value) {
            addCriterion("good_rate <>", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateGreaterThan(Float value) {
            addCriterion("good_rate >", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateGreaterThanOrEqualTo(Float value) {
            addCriterion("good_rate >=", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateLessThan(Float value) {
            addCriterion("good_rate <", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateLessThanOrEqualTo(Float value) {
            addCriterion("good_rate <=", value, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateIn(List<Float> values) {
            addCriterion("good_rate in", values, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateNotIn(List<Float> values) {
            addCriterion("good_rate not in", values, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateBetween(Float value1, Float value2) {
            addCriterion("good_rate between", value1, value2, "goodRate");
            return (Criteria) this;
        }

        public Criteria andGoodRateNotBetween(Float value1, Float value2) {
            addCriterion("good_rate not between", value1, value2, "goodRate");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreIsNull() {
            addCriterion("place_score is null");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreIsNotNull() {
            addCriterion("place_score is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreEqualTo(Float value) {
            addCriterion("place_score =", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreNotEqualTo(Float value) {
            addCriterion("place_score <>", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreGreaterThan(Float value) {
            addCriterion("place_score >", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("place_score >=", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreLessThan(Float value) {
            addCriterion("place_score <", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreLessThanOrEqualTo(Float value) {
            addCriterion("place_score <=", value, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreIn(List<Float> values) {
            addCriterion("place_score in", values, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreNotIn(List<Float> values) {
            addCriterion("place_score not in", values, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreBetween(Float value1, Float value2) {
            addCriterion("place_score between", value1, value2, "placeScore");
            return (Criteria) this;
        }

        public Criteria andPlaceScoreNotBetween(Float value1, Float value2) {
            addCriterion("place_score not between", value1, value2, "placeScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIsNull() {
            addCriterion("hotel_score is null");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIsNotNull() {
            addCriterion("hotel_score is not null");
            return (Criteria) this;
        }

        public Criteria andHotelScoreEqualTo(Float value) {
            addCriterion("hotel_score =", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotEqualTo(Float value) {
            addCriterion("hotel_score <>", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreGreaterThan(Float value) {
            addCriterion("hotel_score >", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("hotel_score >=", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreLessThan(Float value) {
            addCriterion("hotel_score <", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreLessThanOrEqualTo(Float value) {
            addCriterion("hotel_score <=", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIn(List<Float> values) {
            addCriterion("hotel_score in", values, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotIn(List<Float> values) {
            addCriterion("hotel_score not in", values, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreBetween(Float value1, Float value2) {
            addCriterion("hotel_score between", value1, value2, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotBetween(Float value1, Float value2) {
            addCriterion("hotel_score not between", value1, value2, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNull() {
            addCriterion("service_score is null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIsNotNull() {
            addCriterion("service_score is not null");
            return (Criteria) this;
        }

        public Criteria andServiceScoreEqualTo(Float value) {
            addCriterion("service_score =", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotEqualTo(Float value) {
            addCriterion("service_score <>", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThan(Float value) {
            addCriterion("service_score >", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("service_score >=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThan(Float value) {
            addCriterion("service_score <", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreLessThanOrEqualTo(Float value) {
            addCriterion("service_score <=", value, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreIn(List<Float> values) {
            addCriterion("service_score in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotIn(List<Float> values) {
            addCriterion("service_score not in", values, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreBetween(Float value1, Float value2) {
            addCriterion("service_score between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andServiceScoreNotBetween(Float value1, Float value2) {
            addCriterion("service_score not between", value1, value2, "serviceScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreIsNull() {
            addCriterion("traffic_score is null");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreIsNotNull() {
            addCriterion("traffic_score is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreEqualTo(Float value) {
            addCriterion("traffic_score =", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreNotEqualTo(Float value) {
            addCriterion("traffic_score <>", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreGreaterThan(Float value) {
            addCriterion("traffic_score >", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("traffic_score >=", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreLessThan(Float value) {
            addCriterion("traffic_score <", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreLessThanOrEqualTo(Float value) {
            addCriterion("traffic_score <=", value, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreIn(List<Float> values) {
            addCriterion("traffic_score in", values, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreNotIn(List<Float> values) {
            addCriterion("traffic_score not in", values, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreBetween(Float value1, Float value2) {
            addCriterion("traffic_score between", value1, value2, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andTrafficScoreNotBetween(Float value1, Float value2) {
            addCriterion("traffic_score not between", value1, value2, "trafficScore");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNull() {
            addCriterion("is_ok is null");
            return (Criteria) this;
        }

        public Criteria andIsOkIsNotNull() {
            addCriterion("is_ok is not null");
            return (Criteria) this;
        }

        public Criteria andIsOkEqualTo(Boolean value) {
            addCriterion("is_ok =", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotEqualTo(Boolean value) {
            addCriterion("is_ok <>", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThan(Boolean value) {
            addCriterion("is_ok >", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_ok >=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThan(Boolean value) {
            addCriterion("is_ok <", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkLessThanOrEqualTo(Boolean value) {
            addCriterion("is_ok <=", value, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkIn(List<Boolean> values) {
            addCriterion("is_ok in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotIn(List<Boolean> values) {
            addCriterion("is_ok not in", values, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkBetween(Boolean value1, Boolean value2) {
            addCriterion("is_ok between", value1, value2, "isOk");
            return (Criteria) this;
        }

        public Criteria andIsOkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_ok not between", value1, value2, "isOk");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}