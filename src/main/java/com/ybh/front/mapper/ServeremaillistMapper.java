package com.ybh.front.mapper;

import com.ybh.front.model.Serveremaillist;
import com.ybh.front.model.ServeremaillistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServeremaillistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(ServeremaillistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(ServeremaillistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Serveremaillist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Serveremaillist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Serveremaillist> selectByExample(ServeremaillistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Serveremaillist record, @Param("example") ServeremaillistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Serveremaillist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Serveremaillist record, @Param("example") ServeremaillistExample example);
}