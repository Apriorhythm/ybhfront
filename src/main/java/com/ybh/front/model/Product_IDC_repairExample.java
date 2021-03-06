package com.ybh.front.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product_IDC_repairExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Product_IDC_repairExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
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
     * This method corresponds to the database table FreeHost_Product_IDC_repair
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
     * This method corresponds to the database table FreeHost_Product_IDC_repair
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC_repair
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
     * This class corresponds to the database table FreeHost_Product_IDC_repair
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

        public Criteria andIdctitleIsNull() {
            addCriterion("idctitle is null");
            return (Criteria) this;
        }

        public Criteria andIdctitleIsNotNull() {
            addCriterion("idctitle is not null");
            return (Criteria) this;
        }

        public Criteria andIdctitleEqualTo(String value) {
            addCriterion("idctitle =", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleNotEqualTo(String value) {
            addCriterion("idctitle <>", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleGreaterThan(String value) {
            addCriterion("idctitle >", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleGreaterThanOrEqualTo(String value) {
            addCriterion("idctitle >=", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleLessThan(String value) {
            addCriterion("idctitle <", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleLessThanOrEqualTo(String value) {
            addCriterion("idctitle <=", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleLike(String value) {
            addCriterion("idctitle like", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleNotLike(String value) {
            addCriterion("idctitle not like", value, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleIn(List<String> values) {
            addCriterion("idctitle in", values, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleNotIn(List<String> values) {
            addCriterion("idctitle not in", values, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleBetween(String value1, String value2) {
            addCriterion("idctitle between", value1, value2, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctitleNotBetween(String value1, String value2) {
            addCriterion("idctitle not between", value1, value2, "idctitle");
            return (Criteria) this;
        }

        public Criteria andIdctypeIsNull() {
            addCriterion("idctype is null");
            return (Criteria) this;
        }

        public Criteria andIdctypeIsNotNull() {
            addCriterion("idctype is not null");
            return (Criteria) this;
        }

        public Criteria andIdctypeEqualTo(String value) {
            addCriterion("idctype =", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeNotEqualTo(String value) {
            addCriterion("idctype <>", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeGreaterThan(String value) {
            addCriterion("idctype >", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeGreaterThanOrEqualTo(String value) {
            addCriterion("idctype >=", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeLessThan(String value) {
            addCriterion("idctype <", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeLessThanOrEqualTo(String value) {
            addCriterion("idctype <=", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeLike(String value) {
            addCriterion("idctype like", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeNotLike(String value) {
            addCriterion("idctype not like", value, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeIn(List<String> values) {
            addCriterion("idctype in", values, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeNotIn(List<String> values) {
            addCriterion("idctype not in", values, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeBetween(String value1, String value2) {
            addCriterion("idctype between", value1, value2, "idctype");
            return (Criteria) this;
        }

        public Criteria andIdctypeNotBetween(String value1, String value2) {
            addCriterion("idctype not between", value1, value2, "idctype");
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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
     * This class corresponds to the database table FreeHost_Product_IDC_repair
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
     * This class corresponds to the database table FreeHost_Product_IDC_repair
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