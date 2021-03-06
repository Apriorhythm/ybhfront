package com.ybh.front.mapper;

import com.ybh.front.model.OtherProductlist_AGN;
import com.ybh.front.model.OtherProductlist_AGNExample;
import com.ybh.front.model.OtherProductlist_AGNWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherProductlist_AGNMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(OtherProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(OtherProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<OtherProductlist_AGNWithBLOBs> selectByExampleWithBLOBs(OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<OtherProductlist_AGN> selectByExample(OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") OtherProductlist_AGNWithBLOBs record, @Param("example") OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") OtherProductlist_AGNWithBLOBs record, @Param("example") OtherProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_OtherProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") OtherProductlist_AGN record, @Param("example") OtherProductlist_AGNExample example);
}