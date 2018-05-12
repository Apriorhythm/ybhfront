package com.ybh.front.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ICPDBExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public ICPDBExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
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
     * This method corresponds to the database table FreeHost_ICPDB
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
     * This method corresponds to the database table FreeHost_ICPDB
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ICPDB
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
     * This class corresponds to the database table FreeHost_ICPDB
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andFtpnameIsNull() {
            addCriterion("ftpname is null");
            return (Criteria) this;
        }

        public Criteria andFtpnameIsNotNull() {
            addCriterion("ftpname is not null");
            return (Criteria) this;
        }

        public Criteria andFtpnameEqualTo(String value) {
            addCriterion("ftpname =", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameNotEqualTo(String value) {
            addCriterion("ftpname <>", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameGreaterThan(String value) {
            addCriterion("ftpname >", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameGreaterThanOrEqualTo(String value) {
            addCriterion("ftpname >=", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameLessThan(String value) {
            addCriterion("ftpname <", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameLessThanOrEqualTo(String value) {
            addCriterion("ftpname <=", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameLike(String value) {
            addCriterion("ftpname like", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameNotLike(String value) {
            addCriterion("ftpname not like", value, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameIn(List<String> values) {
            addCriterion("ftpname in", values, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameNotIn(List<String> values) {
            addCriterion("ftpname not in", values, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameBetween(String value1, String value2) {
            addCriterion("ftpname between", value1, value2, "ftpname");
            return (Criteria) this;
        }

        public Criteria andFtpnameNotBetween(String value1, String value2) {
            addCriterion("ftpname not between", value1, value2, "ftpname");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeIsNull() {
            addCriterion("firstaddtime is null");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeIsNotNull() {
            addCriterion("firstaddtime is not null");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeEqualTo(Date value) {
            addCriterion("firstaddtime =", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeNotEqualTo(Date value) {
            addCriterion("firstaddtime <>", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeGreaterThan(Date value) {
            addCriterion("firstaddtime >", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("firstaddtime >=", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeLessThan(Date value) {
            addCriterion("firstaddtime <", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeLessThanOrEqualTo(Date value) {
            addCriterion("firstaddtime <=", value, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeIn(List<Date> values) {
            addCriterion("firstaddtime in", values, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeNotIn(List<Date> values) {
            addCriterion("firstaddtime not in", values, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeBetween(Date value1, Date value2) {
            addCriterion("firstaddtime between", value1, value2, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andFirstaddtimeNotBetween(Date value1, Date value2) {
            addCriterion("firstaddtime not between", value1, value2, "firstaddtime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checktime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checktime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checktime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checktime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checktime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checktime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checktime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checktime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checktime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checktime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checktime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checktime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andIcpSnIsNull() {
            addCriterion("ICP_SN is null");
            return (Criteria) this;
        }

        public Criteria andIcpSnIsNotNull() {
            addCriterion("ICP_SN is not null");
            return (Criteria) this;
        }

        public Criteria andIcpSnEqualTo(String value) {
            addCriterion("ICP_SN =", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnNotEqualTo(String value) {
            addCriterion("ICP_SN <>", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnGreaterThan(String value) {
            addCriterion("ICP_SN >", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnGreaterThanOrEqualTo(String value) {
            addCriterion("ICP_SN >=", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnLessThan(String value) {
            addCriterion("ICP_SN <", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnLessThanOrEqualTo(String value) {
            addCriterion("ICP_SN <=", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnLike(String value) {
            addCriterion("ICP_SN like", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnNotLike(String value) {
            addCriterion("ICP_SN not like", value, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnIn(List<String> values) {
            addCriterion("ICP_SN in", values, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnNotIn(List<String> values) {
            addCriterion("ICP_SN not in", values, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnBetween(String value1, String value2) {
            addCriterion("ICP_SN between", value1, value2, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpSnNotBetween(String value1, String value2) {
            addCriterion("ICP_SN not between", value1, value2, "icpSn");
            return (Criteria) this;
        }

        public Criteria andIcpWhoIsNull() {
            addCriterion("ICP_Who is null");
            return (Criteria) this;
        }

        public Criteria andIcpWhoIsNotNull() {
            addCriterion("ICP_Who is not null");
            return (Criteria) this;
        }

        public Criteria andIcpWhoEqualTo(String value) {
            addCriterion("ICP_Who =", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoNotEqualTo(String value) {
            addCriterion("ICP_Who <>", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoGreaterThan(String value) {
            addCriterion("ICP_Who >", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoGreaterThanOrEqualTo(String value) {
            addCriterion("ICP_Who >=", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoLessThan(String value) {
            addCriterion("ICP_Who <", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoLessThanOrEqualTo(String value) {
            addCriterion("ICP_Who <=", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoLike(String value) {
            addCriterion("ICP_Who like", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoNotLike(String value) {
            addCriterion("ICP_Who not like", value, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoIn(List<String> values) {
            addCriterion("ICP_Who in", values, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoNotIn(List<String> values) {
            addCriterion("ICP_Who not in", values, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoBetween(String value1, String value2) {
            addCriterion("ICP_Who between", value1, value2, "icpWho");
            return (Criteria) this;
        }

        public Criteria andIcpWhoNotBetween(String value1, String value2) {
            addCriterion("ICP_Who not between", value1, value2, "icpWho");
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
     * This class corresponds to the database table FreeHost_ICPDB
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
     * This class corresponds to the database table FreeHost_ICPDB
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