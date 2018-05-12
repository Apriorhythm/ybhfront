package com.ybh.front.mapper;

import com.ybh.front.model.Agent_pers;
import com.ybh.front.model.Agent_persExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Agent_persMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Agent_persExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Agent_persExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Agent_pers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Agent_pers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Agent_pers> selectByExample(Agent_persExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Agent_pers record, @Param("example") Agent_persExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Agent_pers
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Agent_pers record, @Param("example") Agent_persExample example);
}