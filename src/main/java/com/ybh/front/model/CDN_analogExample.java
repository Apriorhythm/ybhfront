package com.ybh.front.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CDN_analogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public CDN_analogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
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
     * This method corresponds to the database table FreeHost_CDN_analog
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
     * This method corresponds to the database table FreeHost_CDN_analog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDN_analog
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
     * This class corresponds to the database table FreeHost_CDN_analog
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

        public Criteria andCdndomainIsNull() {
            addCriterion("CDNdomain is null");
            return (Criteria) this;
        }

        public Criteria andCdndomainIsNotNull() {
            addCriterion("CDNdomain is not null");
            return (Criteria) this;
        }

        public Criteria andCdndomainEqualTo(String value) {
            addCriterion("CDNdomain =", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainNotEqualTo(String value) {
            addCriterion("CDNdomain <>", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainGreaterThan(String value) {
            addCriterion("CDNdomain >", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainGreaterThanOrEqualTo(String value) {
            addCriterion("CDNdomain >=", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainLessThan(String value) {
            addCriterion("CDNdomain <", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainLessThanOrEqualTo(String value) {
            addCriterion("CDNdomain <=", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainLike(String value) {
            addCriterion("CDNdomain like", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainNotLike(String value) {
            addCriterion("CDNdomain not like", value, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainIn(List<String> values) {
            addCriterion("CDNdomain in", values, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainNotIn(List<String> values) {
            addCriterion("CDNdomain not in", values, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainBetween(String value1, String value2) {
            addCriterion("CDNdomain between", value1, value2, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainNotBetween(String value1, String value2) {
            addCriterion("CDNdomain not between", value1, value2, "cdndomain");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembIsNull() {
            addCriterion("CDNdomainbyteMB is null");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembIsNotNull() {
            addCriterion("CDNdomainbyteMB is not null");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembEqualTo(Integer value) {
            addCriterion("CDNdomainbyteMB =", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembNotEqualTo(Integer value) {
            addCriterion("CDNdomainbyteMB <>", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembGreaterThan(Integer value) {
            addCriterion("CDNdomainbyteMB >", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembGreaterThanOrEqualTo(Integer value) {
            addCriterion("CDNdomainbyteMB >=", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembLessThan(Integer value) {
            addCriterion("CDNdomainbyteMB <", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembLessThanOrEqualTo(Integer value) {
            addCriterion("CDNdomainbyteMB <=", value, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembIn(List<Integer> values) {
            addCriterion("CDNdomainbyteMB in", values, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembNotIn(List<Integer> values) {
            addCriterion("CDNdomainbyteMB not in", values, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembBetween(Integer value1, Integer value2) {
            addCriterion("CDNdomainbyteMB between", value1, value2, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andCdndomainbytembNotBetween(Integer value1, Integer value2) {
            addCriterion("CDNdomainbyteMB not between", value1, value2, "cdndomainbytemb");
            return (Criteria) this;
        }

        public Criteria andVpsnameIsNull() {
            addCriterion("vpsname is null");
            return (Criteria) this;
        }

        public Criteria andVpsnameIsNotNull() {
            addCriterion("vpsname is not null");
            return (Criteria) this;
        }

        public Criteria andVpsnameEqualTo(String value) {
            addCriterion("vpsname =", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameNotEqualTo(String value) {
            addCriterion("vpsname <>", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameGreaterThan(String value) {
            addCriterion("vpsname >", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameGreaterThanOrEqualTo(String value) {
            addCriterion("vpsname >=", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameLessThan(String value) {
            addCriterion("vpsname <", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameLessThanOrEqualTo(String value) {
            addCriterion("vpsname <=", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameLike(String value) {
            addCriterion("vpsname like", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameNotLike(String value) {
            addCriterion("vpsname not like", value, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameIn(List<String> values) {
            addCriterion("vpsname in", values, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameNotIn(List<String> values) {
            addCriterion("vpsname not in", values, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameBetween(String value1, String value2) {
            addCriterion("vpsname between", value1, value2, "vpsname");
            return (Criteria) this;
        }

        public Criteria andVpsnameNotBetween(String value1, String value2) {
            addCriterion("vpsname not between", value1, value2, "vpsname");
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

        public Criteria andLastlogtimeIsNull() {
            addCriterion("lastlogtime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeIsNotNull() {
            addCriterion("lastlogtime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeEqualTo(Date value) {
            addCriterion("lastlogtime =", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotEqualTo(Date value) {
            addCriterion("lastlogtime <>", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeGreaterThan(Date value) {
            addCriterion("lastlogtime >", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogtime >=", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeLessThan(Date value) {
            addCriterion("lastlogtime <", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlogtime <=", value, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeIn(List<Date> values) {
            addCriterion("lastlogtime in", values, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotIn(List<Date> values) {
            addCriterion("lastlogtime not in", values, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeBetween(Date value1, Date value2) {
            addCriterion("lastlogtime between", value1, value2, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andLastlogtimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlogtime not between", value1, value2, "lastlogtime");
            return (Criteria) this;
        }

        public Criteria andCdnnameIsNull() {
            addCriterion("cdnname is null");
            return (Criteria) this;
        }

        public Criteria andCdnnameIsNotNull() {
            addCriterion("cdnname is not null");
            return (Criteria) this;
        }

        public Criteria andCdnnameEqualTo(String value) {
            addCriterion("cdnname =", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameNotEqualTo(String value) {
            addCriterion("cdnname <>", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameGreaterThan(String value) {
            addCriterion("cdnname >", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameGreaterThanOrEqualTo(String value) {
            addCriterion("cdnname >=", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameLessThan(String value) {
            addCriterion("cdnname <", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameLessThanOrEqualTo(String value) {
            addCriterion("cdnname <=", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameLike(String value) {
            addCriterion("cdnname like", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameNotLike(String value) {
            addCriterion("cdnname not like", value, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameIn(List<String> values) {
            addCriterion("cdnname in", values, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameNotIn(List<String> values) {
            addCriterion("cdnname not in", values, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameBetween(String value1, String value2) {
            addCriterion("cdnname between", value1, value2, "cdnname");
            return (Criteria) this;
        }

        public Criteria andCdnnameNotBetween(String value1, String value2) {
            addCriterion("cdnname not between", value1, value2, "cdnname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_CDN_analog
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
     * This class corresponds to the database table FreeHost_CDN_analog
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