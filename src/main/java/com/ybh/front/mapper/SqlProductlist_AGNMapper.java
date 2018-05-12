package com.ybh.front.mapper;

import com.ybh.front.model.SqlProductlist_AGN;
import com.ybh.front.model.SqlProductlist_AGNExample;
import com.ybh.front.model.SqlProductlist_AGNWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlProductlist_AGNMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(SqlProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(SqlProductlist_AGNWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<SqlProductlist_AGNWithBLOBs> selectByExampleWithBLOBs(SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<SqlProductlist_AGN> selectByExample(SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") SqlProductlist_AGNWithBLOBs record, @Param("example") SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SqlProductlist_AGNWithBLOBs record, @Param("example") SqlProductlist_AGNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist_AGN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") SqlProductlist_AGN record, @Param("example") SqlProductlist_AGNExample example);
}