package com.ybh.front.model;

import java.math.BigDecimal;
import java.util.Date;

public class KeFu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.kefu
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String kefu;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.kefumd5
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String kefumd5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.finishmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private BigDecimal finishmoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.per
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private Integer per;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.havegetmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private BigDecimal havegetmoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_KeFu.addtime
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.id
     *
     * @return the value of FreeHost_KeFu.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.id
     *
     * @param id the value for FreeHost_KeFu.id
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.kefu
     *
     * @return the value of FreeHost_KeFu.kefu
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getKefu() {
        return kefu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.kefu
     *
     * @param kefu the value for FreeHost_KeFu.kefu
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setKefu(String kefu) {
        this.kefu = kefu == null ? null : kefu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.kefumd5
     *
     * @return the value of FreeHost_KeFu.kefumd5
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getKefumd5() {
        return kefumd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.kefumd5
     *
     * @param kefumd5 the value for FreeHost_KeFu.kefumd5
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setKefumd5(String kefumd5) {
        this.kefumd5 = kefumd5 == null ? null : kefumd5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.finishmoney
     *
     * @return the value of FreeHost_KeFu.finishmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public BigDecimal getFinishmoney() {
        return finishmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.finishmoney
     *
     * @param finishmoney the value for FreeHost_KeFu.finishmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setFinishmoney(BigDecimal finishmoney) {
        this.finishmoney = finishmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.per
     *
     * @return the value of FreeHost_KeFu.per
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Integer getPer() {
        return per;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.per
     *
     * @param per the value for FreeHost_KeFu.per
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setPer(Integer per) {
        this.per = per;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.havegetmoney
     *
     * @return the value of FreeHost_KeFu.havegetmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public BigDecimal getHavegetmoney() {
        return havegetmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.havegetmoney
     *
     * @param havegetmoney the value for FreeHost_KeFu.havegetmoney
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setHavegetmoney(BigDecimal havegetmoney) {
        this.havegetmoney = havegetmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_KeFu.addtime
     *
     * @return the value of FreeHost_KeFu.addtime
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_KeFu.addtime
     *
     * @param addtime the value for FreeHost_KeFu.addtime
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}