package com.ybh.front.model;

import java.util.ArrayList;
import java.util.List;

public class ServerBindlistExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public ServerBindlistExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
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
     * This method corresponds to the database table FreeHost_ServerBindlist
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
     * This method corresponds to the database table FreeHost_ServerBindlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerBindlist
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
     * This class corresponds to the database table FreeHost_ServerBindlist
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

        public Criteria andServernameIsNull() {
            addCriterion("servername is null");
            return (Criteria) this;
        }

        public Criteria andServernameIsNotNull() {
            addCriterion("servername is not null");
            return (Criteria) this;
        }

        public Criteria andServernameEqualTo(String value) {
            addCriterion("servername =", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotEqualTo(String value) {
            addCriterion("servername <>", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameGreaterThan(String value) {
            addCriterion("servername >", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameGreaterThanOrEqualTo(String value) {
            addCriterion("servername >=", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLessThan(String value) {
            addCriterion("servername <", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLessThanOrEqualTo(String value) {
            addCriterion("servername <=", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameLike(String value) {
            addCriterion("servername like", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotLike(String value) {
            addCriterion("servername not like", value, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameIn(List<String> values) {
            addCriterion("servername in", values, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotIn(List<String> values) {
            addCriterion("servername not in", values, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameBetween(String value1, String value2) {
            addCriterion("servername between", value1, value2, "servername");
            return (Criteria) this;
        }

        public Criteria andServernameNotBetween(String value1, String value2) {
            addCriterion("servername not between", value1, value2, "servername");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyIsNull() {
            addCriterion("FreeHostsharekey is null");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyIsNotNull() {
            addCriterion("FreeHostsharekey is not null");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyEqualTo(String value) {
            addCriterion("FreeHostsharekey =", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyNotEqualTo(String value) {
            addCriterion("FreeHostsharekey <>", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyGreaterThan(String value) {
            addCriterion("FreeHostsharekey >", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyGreaterThanOrEqualTo(String value) {
            addCriterion("FreeHostsharekey >=", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyLessThan(String value) {
            addCriterion("FreeHostsharekey <", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyLessThanOrEqualTo(String value) {
            addCriterion("FreeHostsharekey <=", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyLike(String value) {
            addCriterion("FreeHostsharekey like", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyNotLike(String value) {
            addCriterion("FreeHostsharekey not like", value, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyIn(List<String> values) {
            addCriterion("FreeHostsharekey in", values, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyNotIn(List<String> values) {
            addCriterion("FreeHostsharekey not in", values, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyBetween(String value1, String value2) {
            addCriterion("FreeHostsharekey between", value1, value2, "freehostsharekey");
            return (Criteria) this;
        }

        public Criteria andFreehostsharekeyNotBetween(String value1, String value2) {
            addCriterion("FreeHostsharekey not between", value1, value2, "freehostsharekey");
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

        public Criteria andNsnameIsNull() {
            addCriterion("nsname is null");
            return (Criteria) this;
        }

        public Criteria andNsnameIsNotNull() {
            addCriterion("nsname is not null");
            return (Criteria) this;
        }

        public Criteria andNsnameEqualTo(String value) {
            addCriterion("nsname =", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameNotEqualTo(String value) {
            addCriterion("nsname <>", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameGreaterThan(String value) {
            addCriterion("nsname >", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameGreaterThanOrEqualTo(String value) {
            addCriterion("nsname >=", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameLessThan(String value) {
            addCriterion("nsname <", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameLessThanOrEqualTo(String value) {
            addCriterion("nsname <=", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameLike(String value) {
            addCriterion("nsname like", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameNotLike(String value) {
            addCriterion("nsname not like", value, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameIn(List<String> values) {
            addCriterion("nsname in", values, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameNotIn(List<String> values) {
            addCriterion("nsname not in", values, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameBetween(String value1, String value2) {
            addCriterion("nsname between", value1, value2, "nsname");
            return (Criteria) this;
        }

        public Criteria andNsnameNotBetween(String value1, String value2) {
            addCriterion("nsname not between", value1, value2, "nsname");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(String value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(String value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(String value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(String value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(String value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(String value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLike(String value) {
            addCriterion("aname like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotLike(String value) {
            addCriterion("aname not like", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<String> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<String> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(String value1, String value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(String value1, String value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTtlIsNull() {
            addCriterion("ttl is null");
            return (Criteria) this;
        }

        public Criteria andTtlIsNotNull() {
            addCriterion("ttl is not null");
            return (Criteria) this;
        }

        public Criteria andTtlEqualTo(Integer value) {
            addCriterion("ttl =", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlNotEqualTo(Integer value) {
            addCriterion("ttl <>", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlGreaterThan(Integer value) {
            addCriterion("ttl >", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttl >=", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlLessThan(Integer value) {
            addCriterion("ttl <", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlLessThanOrEqualTo(Integer value) {
            addCriterion("ttl <=", value, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlIn(List<Integer> values) {
            addCriterion("ttl in", values, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlNotIn(List<Integer> values) {
            addCriterion("ttl not in", values, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlBetween(Integer value1, Integer value2) {
            addCriterion("ttl between", value1, value2, "ttl");
            return (Criteria) this;
        }

        public Criteria andTtlNotBetween(Integer value1, Integer value2) {
            addCriterion("ttl not between", value1, value2, "ttl");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FreeHost_ServerBindlist
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
     * This class corresponds to the database table FreeHost_ServerBindlist
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