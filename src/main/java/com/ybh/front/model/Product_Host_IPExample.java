package com.ybh.front.model;

import java.util.ArrayList;
import java.util.List;

public class Product_Host_IPExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Product_Host_IPExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
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
     * This method corresponds to the database table FreeHost_Product_Host_IP
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
     * This method corresponds to the database table FreeHost_Product_Host_IP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Host_IP
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
     * This class corresponds to the database table FreeHost_Product_Host_IP
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

        public Criteria andServerlistidIsNull() {
            addCriterion("ServerlistID is null");
            return (Criteria) this;
        }

        public Criteria andServerlistidIsNotNull() {
            addCriterion("ServerlistID is not null");
            return (Criteria) this;
        }

        public Criteria andServerlistidEqualTo(Integer value) {
            addCriterion("ServerlistID =", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidNotEqualTo(Integer value) {
            addCriterion("ServerlistID <>", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidGreaterThan(Integer value) {
            addCriterion("ServerlistID >", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ServerlistID >=", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidLessThan(Integer value) {
            addCriterion("ServerlistID <", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidLessThanOrEqualTo(Integer value) {
            addCriterion("ServerlistID <=", value, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidIn(List<Integer> values) {
            addCriterion("ServerlistID in", values, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidNotIn(List<Integer> values) {
            addCriterion("ServerlistID not in", values, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidBetween(Integer value1, Integer value2) {
            addCriterion("ServerlistID between", value1, value2, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andServerlistidNotBetween(Integer value1, Integer value2) {
            addCriterion("ServerlistID not between", value1, value2, "serverlistid");
            return (Criteria) this;
        }

        public Criteria andHostidIsNull() {
            addCriterion("HostID is null");
            return (Criteria) this;
        }

        public Criteria andHostidIsNotNull() {
            addCriterion("HostID is not null");
            return (Criteria) this;
        }

        public Criteria andHostidEqualTo(Integer value) {
            addCriterion("HostID =", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotEqualTo(Integer value) {
            addCriterion("HostID <>", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThan(Integer value) {
            addCriterion("HostID >", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HostID >=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThan(Integer value) {
            addCriterion("HostID <", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThanOrEqualTo(Integer value) {
            addCriterion("HostID <=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidIn(List<Integer> values) {
            addCriterion("HostID in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotIn(List<Integer> values) {
            addCriterion("HostID not in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidBetween(Integer value1, Integer value2) {
            addCriterion("HostID between", value1, value2, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotBetween(Integer value1, Integer value2) {
            addCriterion("HostID not between", value1, value2, "hostid");
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

        public Criteria andOrderbyidIsNull() {
            addCriterion("orderbyid is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyidIsNotNull() {
            addCriterion("orderbyid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyidEqualTo(Integer value) {
            addCriterion("orderbyid =", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidNotEqualTo(Integer value) {
            addCriterion("orderbyid <>", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidGreaterThan(Integer value) {
            addCriterion("orderbyid >", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderbyid >=", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidLessThan(Integer value) {
            addCriterion("orderbyid <", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidLessThanOrEqualTo(Integer value) {
            addCriterion("orderbyid <=", value, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidIn(List<Integer> values) {
            addCriterion("orderbyid in", values, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidNotIn(List<Integer> values) {
            addCriterion("orderbyid not in", values, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidBetween(Integer value1, Integer value2) {
            addCriterion("orderbyid between", value1, value2, "orderbyid");
            return (Criteria) this;
        }

        public Criteria andOrderbyidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderbyid not between", value1, value2, "orderbyid");
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
     * This class corresponds to the database table FreeHost_Product_Host_IP
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
     * This class corresponds to the database table FreeHost_Product_Host_IP
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