package com.ybh.front.model;

public class EmailProductlist_AGNWithBLOBs extends EmailProductlist_AGN {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_EmailProductlist_AGN.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String info;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_EmailProductlist_AGN.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String infomore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_EmailProductlist_AGN.info
     *
     * @return the value of FreeHost_EmailProductlist_AGN.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_EmailProductlist_AGN.info
     *
     * @param info the value for FreeHost_EmailProductlist_AGN.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_EmailProductlist_AGN.infomore
     *
     * @return the value of FreeHost_EmailProductlist_AGN.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getInfomore() {
        return infomore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_EmailProductlist_AGN.infomore
     *
     * @param infomore the value for FreeHost_EmailProductlist_AGN.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setInfomore(String infomore) {
        this.infomore = infomore == null ? null : infomore.trim();
    }
}