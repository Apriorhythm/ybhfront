package com.ybh.front.model;

public class HostProductlistWithBLOBs extends HostProductlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_HostProductlist.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String info;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_HostProductlist.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String infomore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_HostProductlist.info
     *
     * @return the value of FreeHost_HostProductlist.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_HostProductlist.info
     *
     * @param info the value for FreeHost_HostProductlist.info
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_HostProductlist.infomore
     *
     * @return the value of FreeHost_HostProductlist.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getInfomore() {
        return infomore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_HostProductlist.infomore
     *
     * @param infomore the value for FreeHost_HostProductlist.infomore
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setInfomore(String infomore) {
        this.infomore = infomore == null ? null : infomore.trim();
    }
}