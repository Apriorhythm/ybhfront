package com.ybh.front.mapper;

import com.ybh.front.model.ServerCDNlist;
import com.ybh.front.model.ServerCDNlistExample;
import com.ybh.front.model.ServerCDNlistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerCDNlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(ServerCDNlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(ServerCDNlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<ServerCDNlistWithBLOBs> selectByExampleWithBLOBs(ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<ServerCDNlist> selectByExample(ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") ServerCDNlistWithBLOBs record, @Param("example") ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ServerCDNlistWithBLOBs record, @Param("example") ServerCDNlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerCDNlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") ServerCDNlist record, @Param("example") ServerCDNlistExample example);
}