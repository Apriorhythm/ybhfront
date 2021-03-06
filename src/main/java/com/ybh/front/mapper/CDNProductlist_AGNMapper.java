package com.ybh.front.mapper;

import com.ybh.front.model.CDNProductlist_AGN;
import com.ybh.front.model.CDNProductlist_AGNExample;
import com.ybh.front.model.CDNProductlist_AGNWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CDNProductlist_AGNMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(CDNProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(CDNProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<CDNProductlist_AGNWithBLOBs> selectByExampleWithBLOBs(CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<CDNProductlist_AGN> selectByExample(CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") CDNProductlist_AGNWithBLOBs record, @Param("example") CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CDNProductlist_AGNWithBLOBs record, @Param("example") CDNProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_CDNProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") CDNProductlist_AGN record, @Param("example") CDNProductlist_AGNExample example);
}