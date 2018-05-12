package com.ybh.front.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FunctionlogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public FunctionlogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
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
     * This method corresponds to the database table FreeHost_Functionlog
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
     * This method corresponds to the database table FreeHost_Functionlog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Functionlog
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
     * This class corresponds to the database table FreeHost_Functionlog
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

        public Criteria andOpusernameIsNull() {
            addCriterion("opusername is null");
            return (Criteria) this;
        }

        public Criteria andOpusernameIsNotNull() {
            addCriterion("opusername is not null");
            return (Criteria) this;
        }

        public Criteria andOpusernameEqualTo(String value) {
            addCriterion("opusername =", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotEqualTo(String value) {
            addCriterion("opusername <>", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThan(String value) {
            addCriterion("opusername >", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameGreaterThanOrEqualTo(String value) {
            addCriterion("opusername >=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThan(String value) {
            addCriterion("opusername <", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLessThanOrEqualTo(String value) {
            addCriterion("opusername <=", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameLike(String value) {
            addCriterion("opusername like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotLike(String value) {
            addCriterion("opusername not like", value, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameIn(List<String> values) {
            addCriterion("opusername in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotIn(List<String> values) {
            addCriterion("opusername not in", values, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameBetween(String value1, String value2) {
            addCriterion("opusername between", value1, value2, "opusername");
            return (Criteria) this;
        }

        public Criteria andOpusernameNotBetween(String value1, String value2) {
            addCriterion("opusername not between", value1, value2, "opusername");
            return (Criteria) this;
        }

        public Criteria andAttimeIsNull() {
            addCriterion("attime is null");
            return (Criteria) this;
        }

        public Criteria andAttimeIsNotNull() {
            addCriterion("attime is not null");
            return (Criteria) this;
        }

        public Criteria andAttimeEqualTo(Date value) {
            addCriterion("attime =", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeNotEqualTo(Date value) {
            addCriterion("attime <>", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeGreaterThan(Date value) {
            addCriterion("attime >", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attime >=", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeLessThan(Date value) {
            addCriterion("attime <", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeLessThanOrEqualTo(Date value) {
            addCriterion("attime <=", value, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeIn(List<Date> values) {
            addCriterion("attime in", values, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeNotIn(List<Date> values) {
            addCriterion("attime not in", values, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeBetween(Date value1, Date value2) {
            addCriterion("attime between", value1, value2, "attime");
            return (Criteria) this;
        }

        public Criteria andAttimeNotBetween(Date value1, Date value2) {
            addCriterion("attime not between", value1, value2, "attime");
            return (Criteria) this;
        }

        public Criteria andForwhatIsNull() {
            addCriterion("forwhat is null");
            return (Criteria) this;
        }

        public Criteria andForwhatIsNotNull() {
            addCriterion("forwhat is not null");
            return (Criteria) this;
        }

        public Criteria andForwhatEqualTo(String value) {
            addCriterion("forwhat =", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatNotEqualTo(String value) {
            addCriterion("forwhat <>", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatGreaterThan(String value) {
            addCriterion("forwhat >", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatGreaterThanOrEqualTo(String value) {
            addCriterion("forwhat >=", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatLessThan(String value) {
            addCriterion("forwhat <", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatLessThanOrEqualTo(String value) {
            addCriterion("forwhat <=", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatLike(String value) {
            addCriterion("forwhat like", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatNotLike(String value) {
            addCriterion("forwhat not like", value, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatIn(List<String> values) {
            addCriterion("forwhat in", values, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatNotIn(List<String> values) {
            addCriterion("forwhat not in", values, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatBetween(String value1, String value2) {
            addCriterion("forwhat between", value1, value2, "forwhat");
            return (Criteria) this;
        }

        public Criteria andForwhatNotBetween(String value1, String value2) {
            addCriterion("forwhat not between", value1, value2, "forwhat");
            return (Criteria) this;
        }

        public Criteria andWhichproductIsNull() {
            addCriterion("whichProduct is null");
            return (Criteria) this;
        }

        public Criteria andWhichproductIsNotNull() {
            addCriterion("whichProduct is not null");
            return (Criteria) this;
        }

        public Criteria andWhichproductEqualTo(String value) {
            addCriterion("whichProduct =", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductNotEqualTo(String value) {
            addCriterion("whichProduct <>", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductGreaterThan(String value) {
            addCriterion("whichProduct >", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductGreaterThanOrEqualTo(String value) {
            addCriterion("whichProduct >=", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductLessThan(String value) {
            addCriterion("whichProduct <", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductLessThanOrEqualTo(String value) {
            addCriterion("whichProduct <=", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductLike(String value) {
            addCriterion("whichProduct like", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductNotLike(String value) {
            addCriterion("whichProduct not like", value, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductIn(List<String> values) {
            addCriterion("whichProduct in", values, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductNotIn(List<String> values) {
            addCriterion("whichProduct not in", values, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductBetween(String value1, String value2) {
            addCriterion("whichProduct between", value1, value2, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andWhichproductNotBetween(String value1, String value2) {
            addCriterion("whichProduct not between", value1, value2, "whichproduct");
            return (Criteria) this;
        }

        public Criteria andPdidIsNull() {
            addCriterion("pdid is null");
            return (Criteria) this;
        }

        public Criteria andPdidIsNotNull() {
            addCriterion("pdid is not null");
            return (Criteria) this;
        }

        public Criteria andPdidEqualTo(Integer value) {
            addCriterion("pdid =", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotEqualTo(Integer value) {
            addCriterion("pdid <>", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThan(Integer value) {
            addCriterion("pdid >", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdid >=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThan(Integer value) {
            addCriterion("pdid <", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThanOrEqualTo(Integer value) {
            addCriterion("pdid <=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidIn(List<Integer> values) {
            addCriterion("pdid in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotIn(List<Integer> values) {
            addCriterion("pdid not in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidBetween(Integer value1, Integer value2) {
            addCriterion("pdid between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdid not between", value1, value2, "pdid");
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

        public Criteria andFunIsNull() {
            addCriterion("fun is null");
            return (Criteria) this;
        }

        public Criteria andFunIsNotNull() {
            addCriterion("fun is not null");
            return (Criteria) this;
        }

        public Criteria andFunEqualTo(String value) {
            addCriterion("fun =", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotEqualTo(String value) {
            addCriterion("fun <>", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunGreaterThan(String value) {
            addCriterion("fun >", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunGreaterThanOrEqualTo(String value) {
            addCriterion("fun >=", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLessThan(String value) {
            addCriterion("fun <", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLessThanOrEqualTo(String value) {
            addCriterion("fun <=", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunLike(String value) {
            addCriterion("fun like", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotLike(String value) {
            addCriterion("fun not like", value, "fun");
            return (Criteria) this;
        }

        public Criteria andFunIn(List<String> values) {
            addCriterion("fun in", values, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotIn(List<String> values) {
            addCriterion("fun not in", values, "fun");
            return (Criteria) this;
        }

        public Criteria andFunBetween(String value1, String value2) {
            addCriterion("fun between", value1, value2, "fun");
            return (Criteria) this;
        }

        public Criteria andFunNotBetween(String value1, String value2) {
            addCriterion("fun not between", value1, value2, "fun");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
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
     * This class corresponds to the database table FreeHost_Functionlog
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
     * This class corresponds to the database table FreeHost_Functionlog
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