package com.ybh.front.model;

import java.util.ArrayList;
import java.util.List;

public class IDCIPExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public IDCIPExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
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

        public Criteria andJgidIsNull() {
            addCriterion("JGID is null");
            return (Criteria) this;
        }

        public Criteria andJgidIsNotNull() {
            addCriterion("JGID is not null");
            return (Criteria) this;
        }

        public Criteria andJgidEqualTo(Integer value) {
            addCriterion("JGID =", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotEqualTo(Integer value) {
            addCriterion("JGID <>", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidGreaterThan(Integer value) {
            addCriterion("JGID >", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JGID >=", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidLessThan(Integer value) {
            addCriterion("JGID <", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidLessThanOrEqualTo(Integer value) {
            addCriterion("JGID <=", value, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidIn(List<Integer> values) {
            addCriterion("JGID in", values, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotIn(List<Integer> values) {
            addCriterion("JGID not in", values, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidBetween(Integer value1, Integer value2) {
            addCriterion("JGID between", value1, value2, "jgid");
            return (Criteria) this;
        }

        public Criteria andJgidNotBetween(Integer value1, Integer value2) {
            addCriterion("JGID not between", value1, value2, "jgid");
            return (Criteria) this;
        }

        public Criteria andPdidIsNull() {
            addCriterion("PDID is null");
            return (Criteria) this;
        }

        public Criteria andPdidIsNotNull() {
            addCriterion("PDID is not null");
            return (Criteria) this;
        }

        public Criteria andPdidEqualTo(Integer value) {
            addCriterion("PDID =", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotEqualTo(Integer value) {
            addCriterion("PDID <>", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThan(Integer value) {
            addCriterion("PDID >", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PDID >=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThan(Integer value) {
            addCriterion("PDID <", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThanOrEqualTo(Integer value) {
            addCriterion("PDID <=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidIn(List<Integer> values) {
            addCriterion("PDID in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotIn(List<Integer> values) {
            addCriterion("PDID not in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidBetween(Integer value1, Integer value2) {
            addCriterion("PDID between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("PDID not between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andAgent1IsNull() {
            addCriterion("agent1 is null");
            return (Criteria) this;
        }

        public Criteria andAgent1IsNotNull() {
            addCriterion("agent1 is not null");
            return (Criteria) this;
        }

        public Criteria andAgent1EqualTo(String value) {
            addCriterion("agent1 =", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1NotEqualTo(String value) {
            addCriterion("agent1 <>", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1GreaterThan(String value) {
            addCriterion("agent1 >", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1GreaterThanOrEqualTo(String value) {
            addCriterion("agent1 >=", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1LessThan(String value) {
            addCriterion("agent1 <", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1LessThanOrEqualTo(String value) {
            addCriterion("agent1 <=", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1Like(String value) {
            addCriterion("agent1 like", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1NotLike(String value) {
            addCriterion("agent1 not like", value, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1In(List<String> values) {
            addCriterion("agent1 in", values, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1NotIn(List<String> values) {
            addCriterion("agent1 not in", values, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1Between(String value1, String value2) {
            addCriterion("agent1 between", value1, value2, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent1NotBetween(String value1, String value2) {
            addCriterion("agent1 not between", value1, value2, "agent1");
            return (Criteria) this;
        }

        public Criteria andAgent2IsNull() {
            addCriterion("agent2 is null");
            return (Criteria) this;
        }

        public Criteria andAgent2IsNotNull() {
            addCriterion("agent2 is not null");
            return (Criteria) this;
        }

        public Criteria andAgent2EqualTo(String value) {
            addCriterion("agent2 =", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2NotEqualTo(String value) {
            addCriterion("agent2 <>", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2GreaterThan(String value) {
            addCriterion("agent2 >", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2GreaterThanOrEqualTo(String value) {
            addCriterion("agent2 >=", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2LessThan(String value) {
            addCriterion("agent2 <", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2LessThanOrEqualTo(String value) {
            addCriterion("agent2 <=", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2Like(String value) {
            addCriterion("agent2 like", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2NotLike(String value) {
            addCriterion("agent2 not like", value, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2In(List<String> values) {
            addCriterion("agent2 in", values, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2NotIn(List<String> values) {
            addCriterion("agent2 not in", values, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2Between(String value1, String value2) {
            addCriterion("agent2 between", value1, value2, "agent2");
            return (Criteria) this;
        }

        public Criteria andAgent2NotBetween(String value1, String value2) {
            addCriterion("agent2 not between", value1, value2, "agent2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated do_not_delete_during_merge Fri May 11 11:16:07 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
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