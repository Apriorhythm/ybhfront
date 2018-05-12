package com.ybh.front.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product_VPS_ADSLExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Product_VPS_ADSLExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
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
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
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
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS_ADSL
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
     * This class corresponds to the database table FreeHost_Product_VPS_ADSL
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

        public Criteria andVpspdidIsNull() {
            addCriterion("VPSpdID is null");
            return (Criteria) this;
        }

        public Criteria andVpspdidIsNotNull() {
            addCriterion("VPSpdID is not null");
            return (Criteria) this;
        }

        public Criteria andVpspdidEqualTo(Integer value) {
            addCriterion("VPSpdID =", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidNotEqualTo(Integer value) {
            addCriterion("VPSpdID <>", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidGreaterThan(Integer value) {
            addCriterion("VPSpdID >", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VPSpdID >=", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidLessThan(Integer value) {
            addCriterion("VPSpdID <", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidLessThanOrEqualTo(Integer value) {
            addCriterion("VPSpdID <=", value, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidIn(List<Integer> values) {
            addCriterion("VPSpdID in", values, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidNotIn(List<Integer> values) {
            addCriterion("VPSpdID not in", values, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidBetween(Integer value1, Integer value2) {
            addCriterion("VPSpdID between", value1, value2, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpspdidNotBetween(Integer value1, Integer value2) {
            addCriterion("VPSpdID not between", value1, value2, "vpspdid");
            return (Criteria) this;
        }

        public Criteria andVpsidIsNull() {
            addCriterion("VPSID is null");
            return (Criteria) this;
        }

        public Criteria andVpsidIsNotNull() {
            addCriterion("VPSID is not null");
            return (Criteria) this;
        }

        public Criteria andVpsidEqualTo(Integer value) {
            addCriterion("VPSID =", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidNotEqualTo(Integer value) {
            addCriterion("VPSID <>", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidGreaterThan(Integer value) {
            addCriterion("VPSID >", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VPSID >=", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidLessThan(Integer value) {
            addCriterion("VPSID <", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidLessThanOrEqualTo(Integer value) {
            addCriterion("VPSID <=", value, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidIn(List<Integer> values) {
            addCriterion("VPSID in", values, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidNotIn(List<Integer> values) {
            addCriterion("VPSID not in", values, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidBetween(Integer value1, Integer value2) {
            addCriterion("VPSID between", value1, value2, "vpsid");
            return (Criteria) this;
        }

        public Criteria andVpsidNotBetween(Integer value1, Integer value2) {
            addCriterion("VPSID not between", value1, value2, "vpsid");
            return (Criteria) this;
        }

        public Criteria andAdslnameIsNull() {
            addCriterion("ADSLname is null");
            return (Criteria) this;
        }

        public Criteria andAdslnameIsNotNull() {
            addCriterion("ADSLname is not null");
            return (Criteria) this;
        }

        public Criteria andAdslnameEqualTo(String value) {
            addCriterion("ADSLname =", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotEqualTo(String value) {
            addCriterion("ADSLname <>", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameGreaterThan(String value) {
            addCriterion("ADSLname >", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameGreaterThanOrEqualTo(String value) {
            addCriterion("ADSLname >=", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLessThan(String value) {
            addCriterion("ADSLname <", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLessThanOrEqualTo(String value) {
            addCriterion("ADSLname <=", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameLike(String value) {
            addCriterion("ADSLname like", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotLike(String value) {
            addCriterion("ADSLname not like", value, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameIn(List<String> values) {
            addCriterion("ADSLname in", values, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotIn(List<String> values) {
            addCriterion("ADSLname not in", values, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameBetween(String value1, String value2) {
            addCriterion("ADSLname between", value1, value2, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslnameNotBetween(String value1, String value2) {
            addCriterion("ADSLname not between", value1, value2, "adslname");
            return (Criteria) this;
        }

        public Criteria andAdslpassIsNull() {
            addCriterion("ADSLpass is null");
            return (Criteria) this;
        }

        public Criteria andAdslpassIsNotNull() {
            addCriterion("ADSLpass is not null");
            return (Criteria) this;
        }

        public Criteria andAdslpassEqualTo(String value) {
            addCriterion("ADSLpass =", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassNotEqualTo(String value) {
            addCriterion("ADSLpass <>", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassGreaterThan(String value) {
            addCriterion("ADSLpass >", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassGreaterThanOrEqualTo(String value) {
            addCriterion("ADSLpass >=", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassLessThan(String value) {
            addCriterion("ADSLpass <", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassLessThanOrEqualTo(String value) {
            addCriterion("ADSLpass <=", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassLike(String value) {
            addCriterion("ADSLpass like", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassNotLike(String value) {
            addCriterion("ADSLpass not like", value, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassIn(List<String> values) {
            addCriterion("ADSLpass in", values, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassNotIn(List<String> values) {
            addCriterion("ADSLpass not in", values, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassBetween(String value1, String value2) {
            addCriterion("ADSLpass between", value1, value2, "adslpass");
            return (Criteria) this;
        }

        public Criteria andAdslpassNotBetween(String value1, String value2) {
            addCriterion("ADSLpass not between", value1, value2, "adslpass");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNull() {
            addCriterion("entertime is null");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNotNull() {
            addCriterion("entertime is not null");
            return (Criteria) this;
        }

        public Criteria andEntertimeEqualTo(Date value) {
            addCriterion("entertime =", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotEqualTo(Date value) {
            addCriterion("entertime <>", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThan(Date value) {
            addCriterion("entertime >", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entertime >=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThan(Date value) {
            addCriterion("entertime <", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThanOrEqualTo(Date value) {
            addCriterion("entertime <=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeIn(List<Date> values) {
            addCriterion("entertime in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotIn(List<Date> values) {
            addCriterion("entertime not in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeBetween(Date value1, Date value2) {
            addCriterion("entertime between", value1, value2, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotBetween(Date value1, Date value2) {
            addCriterion("entertime not between", value1, value2, "entertime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
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

        public Criteria andVlanidIsNull() {
            addCriterion("VLANid is null");
            return (Criteria) this;
        }

        public Criteria andVlanidIsNotNull() {
            addCriterion("VLANid is not null");
            return (Criteria) this;
        }

        public Criteria andVlanidEqualTo(Integer value) {
            addCriterion("VLANid =", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidNotEqualTo(Integer value) {
            addCriterion("VLANid <>", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidGreaterThan(Integer value) {
            addCriterion("VLANid >", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VLANid >=", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidLessThan(Integer value) {
            addCriterion("VLANid <", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidLessThanOrEqualTo(Integer value) {
            addCriterion("VLANid <=", value, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidIn(List<Integer> values) {
            addCriterion("VLANid in", values, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidNotIn(List<Integer> values) {
            addCriterion("VLANid not in", values, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidBetween(Integer value1, Integer value2) {
            addCriterion("VLANid between", value1, value2, "vlanid");
            return (Criteria) this;
        }

        public Criteria andVlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("VLANid not between", value1, value2, "vlanid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_Product_VPS_ADSL
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
     * This class corresponds to the database table FreeHost_Product_VPS_ADSL
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