package com.zl.qunawan.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TrafficExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrafficExample() {
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

        public Criteria andGoPointIsNull() {
            addCriterion("go_point is null");
            return (Criteria) this;
        }

        public Criteria andGoPointIsNotNull() {
            addCriterion("go_point is not null");
            return (Criteria) this;
        }

        public Criteria andGoPointEqualTo(String value) {
            addCriterion("go_point =", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointNotEqualTo(String value) {
            addCriterion("go_point <>", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointGreaterThan(String value) {
            addCriterion("go_point >", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointGreaterThanOrEqualTo(String value) {
            addCriterion("go_point >=", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointLessThan(String value) {
            addCriterion("go_point <", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointLessThanOrEqualTo(String value) {
            addCriterion("go_point <=", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointLike(String value) {
            addCriterion("go_point like", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointNotLike(String value) {
            addCriterion("go_point not like", value, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointIn(List<String> values) {
            addCriterion("go_point in", values, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointNotIn(List<String> values) {
            addCriterion("go_point not in", values, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointBetween(String value1, String value2) {
            addCriterion("go_point between", value1, value2, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoPointNotBetween(String value1, String value2) {
            addCriterion("go_point not between", value1, value2, "goPoint");
            return (Criteria) this;
        }

        public Criteria andGoTimeIsNull() {
            addCriterion("go_time is null");
            return (Criteria) this;
        }

        public Criteria andGoTimeIsNotNull() {
            addCriterion("go_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoTimeEqualTo(String value) {
            addCriterion("go_time =", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotEqualTo(String value) {
            addCriterion("go_time <>", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeGreaterThan(String value) {
            addCriterion("go_time >", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("go_time >=", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLessThan(String value) {
            addCriterion("go_time <", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLessThanOrEqualTo(String value) {
            addCriterion("go_time <=", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeLike(String value) {
            addCriterion("go_time like", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotLike(String value) {
            addCriterion("go_time not like", value, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeIn(List<String> values) {
            addCriterion("go_time in", values, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotIn(List<String> values) {
            addCriterion("go_time not in", values, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeBetween(String value1, String value2) {
            addCriterion("go_time between", value1, value2, "goTime");
            return (Criteria) this;
        }

        public Criteria andGoTimeNotBetween(String value1, String value2) {
            addCriterion("go_time not between", value1, value2, "goTime");
            return (Criteria) this;
        }

        public Criteria andReturnPointIsNull() {
            addCriterion("return_point is null");
            return (Criteria) this;
        }

        public Criteria andReturnPointIsNotNull() {
            addCriterion("return_point is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPointEqualTo(String value) {
            addCriterion("return_point =", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointNotEqualTo(String value) {
            addCriterion("return_point <>", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointGreaterThan(String value) {
            addCriterion("return_point >", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointGreaterThanOrEqualTo(String value) {
            addCriterion("return_point >=", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointLessThan(String value) {
            addCriterion("return_point <", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointLessThanOrEqualTo(String value) {
            addCriterion("return_point <=", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointLike(String value) {
            addCriterion("return_point like", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointNotLike(String value) {
            addCriterion("return_point not like", value, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointIn(List<String> values) {
            addCriterion("return_point in", values, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointNotIn(List<String> values) {
            addCriterion("return_point not in", values, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointBetween(String value1, String value2) {
            addCriterion("return_point between", value1, value2, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnPointNotBetween(String value1, String value2) {
            addCriterion("return_point not between", value1, value2, "returnPoint");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(String value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(String value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(String value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(String value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLike(String value) {
            addCriterion("return_time like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotLike(String value) {
            addCriterion("return_time not like", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<String> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<String> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(String value1, String value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(String value1, String value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
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