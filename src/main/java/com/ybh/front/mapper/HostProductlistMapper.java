package com.ybh.front.mapper;

import com.ybh.front.model.HostProductlist;
import com.ybh.front.model.HostProductlistExample;
import com.ybh.front.model.HostProductlistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostProductlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(HostProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(HostProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<HostProductlistWithBLOBs> selectByExampleWithBLOBs(HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<HostProductlist> selectByExample(HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") HostProductlistWithBLOBs record, @Param("example") HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") HostProductlistWithBLOBs record, @Param("example") HostProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_HostProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") HostProductlist record, @Param("example") HostProductlistExample example);
}