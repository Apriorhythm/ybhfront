package com.ybh.front.mapper;

import com.ybh.front.model.ServerPORTlist;
import com.ybh.front.model.ServerPORTlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServerPORTlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(ServerPORTlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(ServerPORTlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(ServerPORTlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(ServerPORTlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<ServerPORTlist> selectByExample(ServerPORTlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") ServerPORTlist record, @Param("example") ServerPORTlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_ServerPORTlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") ServerPORTlist record, @Param("example") ServerPORTlistExample example);
}