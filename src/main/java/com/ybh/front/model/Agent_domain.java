package com.ybh.front.model;

public class Agent_domain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Agent_domain.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Agent_domain.domain
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String domain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Agent_domain.agent1
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String agent1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Agent_domain.agent2
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String agent2;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Agent_domain.id
     *
     * @return the value of FreeHost_Agent_domain.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Agent_domain.id
     *
     * @param id the value for FreeHost_Agent_domain.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Agent_domain.domain
     *
     * @return the value of FreeHost_Agent_domain.domain
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Agent_domain.domain
     *
     * @param domain the value for FreeHost_Agent_domain.domain
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Agent_domain.agent1
     *
     * @return the value of FreeHost_Agent_domain.agent1
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getAgent1() {
        return agent1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Agent_domain.agent1
     *
     * @param agent1 the value for FreeHost_Agent_domain.agent1
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setAgent1(String agent1) {
        this.agent1 = agent1 == null ? null : agent1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Agent_domain.agent2
     *
     * @return the value of FreeHost_Agent_domain.agent2
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getAgent2() {
        return agent2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Agent_domain.agent2
     *
     * @param agent2 the value for FreeHost_Agent_domain.agent2
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setAgent2(String agent2) {
        this.agent2 = agent2 == null ? null : agent2.trim();
    }
}