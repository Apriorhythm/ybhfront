package com.ybh.front.model;

public class Product_HostWithBLOBs extends Product_Host {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Product_Host.DenySiteIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String denysiteip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column FreeHost_Product_Host.pauseinfo
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    private String pauseinfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Product_Host.DenySiteIP
     *
     * @return the value of FreeHost_Product_Host.DenySiteIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getDenysiteip() {
        return denysiteip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Product_Host.DenySiteIP
     *
     * @param denysiteip the value for FreeHost_Product_Host.DenySiteIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setDenysiteip(String denysiteip) {
        this.denysiteip = denysiteip == null ? null : denysiteip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column FreeHost_Product_Host.pauseinfo
     *
     * @return the value of FreeHost_Product_Host.pauseinfo
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public String getPauseinfo() {
        return pauseinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column FreeHost_Product_Host.pauseinfo
     *
     * @param pauseinfo the value for FreeHost_Product_Host.pauseinfo
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    public void setPauseinfo(String pauseinfo) {
        this.pauseinfo = pauseinfo == null ? null : pauseinfo.trim();
    }
}