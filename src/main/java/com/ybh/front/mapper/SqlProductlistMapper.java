package com.ybh.front.mapper;

import com.ybh.front.model.SqlProductlist;
import com.ybh.front.model.SqlProductlistExample;
import com.ybh.front.model.SqlProductlistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqlProductlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(SqlProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(SqlProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<SqlProductlistWithBLOBs> selectByExampleWithBLOBs(SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<SqlProductlist> selectByExample(SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") SqlProductlistWithBLOBs record, @Param("example") SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SqlProductlistWithBLOBs record, @Param("example") SqlProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_SqlProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") SqlProductlist record, @Param("example") SqlProductlistExample example);
}