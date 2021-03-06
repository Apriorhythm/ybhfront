package com.ybh.front.mapper;

import com.ybh.front.model.Serversqllist;
import com.ybh.front.model.ServersqllistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServersqllistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(ServersqllistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(ServersqllistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Serversqllist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Serversqllist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Serversqllist> selectByExample(ServersqllistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Serversqllist record, @Param("example") ServersqllistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serversqllist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Serversqllist record, @Param("example") ServersqllistExample example);
}