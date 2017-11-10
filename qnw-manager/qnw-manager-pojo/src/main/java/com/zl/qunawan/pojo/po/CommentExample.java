package com.zl.qunawan.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTripIdIsNull() {
            addCriterion("trip_id is null");
            return (Criteria) this;
        }

        public Criteria andTripIdIsNotNull() {
            addCriterion("trip_id is not null");
            return (Criteria) this;
        }

        public Criteria andTripIdEqualTo(Integer value) {
            addCriterion("trip_id =", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotEqualTo(Integer value) {
            addCriterion("trip_id <>", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThan(Integer value) {
            addCriterion("trip_id >", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trip_id >=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThan(Integer value) {
            addCriterion("trip_id <", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThanOrEqualTo(Integer value) {
            addCriterion("trip_id <=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdIn(List<Integer> values) {
            addCriterion("trip_id in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotIn(List<Integer> values) {
            addCriterion("trip_id not in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdBetween(Integer value1, Integer value2) {
            addCriterion("trip_id between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trip_id not between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(Integer value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(Integer value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(Integer value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(Integer value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<Integer> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<Integer> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNull() {
            addCriterion("place_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIsNotNull() {
            addCriterion("place_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceIdEqualTo(Integer value) {
            addCriterion("place_id =", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotEqualTo(Integer value) {
            addCriterion("place_id <>", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThan(Integer value) {
            addCriterion("place_id >", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_id >=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThan(Integer value) {
            addCriterion("place_id <", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("place_id <=", value, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdIn(List<Integer> values) {
            addCriterion("place_id in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotIn(List<Integer> values) {
            addCriterion("place_id not in", values, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdBetween(Integer value1, Integer value2) {
            addCriterion("place_id between", value1, value2, "placeId");
            return (Criteria) this;
        }

        public Criteria andPlaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("place_id not between", value1, value2, "placeId");
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

        public Criteria andHotelEqualTo(Integer value) {
            addCriterion("hotel =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(Integer value) {
            addCriterion("hotel <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(Integer value) {
            addCriterion("hotel >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(Integer value) {
            addCriterion("hotel <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(Integer value) {
            addCriterion("hotel <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<Integer> values) {
            addCriterion("hotel in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<Integer> values) {
            addCriterion("hotel not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(Integer value1, Integer value2) {
            addCriterion("hotel between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel not between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(Integer value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(Integer value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(Integer value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(Integer value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(Integer value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<Integer> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<Integer> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(Integer value1, Integer value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("service not between", value1, value2, "service");
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

        public Criteria andTrafficEqualTo(Integer value) {
            addCriterion("traffic =", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotEqualTo(Integer value) {
            addCriterion("traffic <>", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThan(Integer value) {
            addCriterion("traffic >", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("traffic >=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThan(Integer value) {
            addCriterion("traffic <", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficLessThanOrEqualTo(Integer value) {
            addCriterion("traffic <=", value, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficIn(List<Integer> values) {
            addCriterion("traffic in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotIn(List<Integer> values) {
            addCriterion("traffic not in", values, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficBetween(Integer value1, Integer value2) {
            addCriterion("traffic between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andTrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("traffic not between", value1, value2, "traffic");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUsefullIsNull() {
            addCriterion("usefull is null");
            return (Criteria) this;
        }

        public Criteria andUsefullIsNotNull() {
            addCriterion("usefull is not null");
            return (Criteria) this;
        }

        public Criteria andUsefullEqualTo(Integer value) {
            addCriterion("usefull =", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullNotEqualTo(Integer value) {
            addCriterion("usefull <>", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullGreaterThan(Integer value) {
            addCriterion("usefull >", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullGreaterThanOrEqualTo(Integer value) {
            addCriterion("usefull >=", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullLessThan(Integer value) {
            addCriterion("usefull <", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullLessThanOrEqualTo(Integer value) {
            addCriterion("usefull <=", value, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullIn(List<Integer> values) {
            addCriterion("usefull in", values, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullNotIn(List<Integer> values) {
            addCriterion("usefull not in", values, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullBetween(Integer value1, Integer value2) {
            addCriterion("usefull between", value1, value2, "usefull");
            return (Criteria) this;
        }

        public Criteria andUsefullNotBetween(Integer value1, Integer value2) {
            addCriterion("usefull not between", value1, value2, "usefull");
            return (Criteria) this;
        }

        public Criteria andUselessIsNull() {
            addCriterion("useless is null");
            return (Criteria) this;
        }

        public Criteria andUselessIsNotNull() {
            addCriterion("useless is not null");
            return (Criteria) this;
        }

        public Criteria andUselessEqualTo(Integer value) {
            addCriterion("useless =", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessNotEqualTo(Integer value) {
            addCriterion("useless <>", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessGreaterThan(Integer value) {
            addCriterion("useless >", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessGreaterThanOrEqualTo(Integer value) {
            addCriterion("useless >=", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessLessThan(Integer value) {
            addCriterion("useless <", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessLessThanOrEqualTo(Integer value) {
            addCriterion("useless <=", value, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessIn(List<Integer> values) {
            addCriterion("useless in", values, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessNotIn(List<Integer> values) {
            addCriterion("useless not in", values, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessBetween(Integer value1, Integer value2) {
            addCriterion("useless between", value1, value2, "useless");
            return (Criteria) this;
        }

        public Criteria andUselessNotBetween(Integer value1, Integer value2) {
            addCriterion("useless not between", value1, value2, "useless");
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