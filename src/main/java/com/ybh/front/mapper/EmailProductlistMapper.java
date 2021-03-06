package com.ybh.front.mapper;

import com.ybh.front.model.EmailProductlist;
import com.ybh.front.model.EmailProductlistExample;
import com.ybh.front.model.EmailProductlistWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailProductlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(EmailProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(EmailProductlistWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<EmailProductlistWithBLOBs> selectByExampleWithBLOBs(EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<EmailProductlist> selectByExample(EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") EmailProductlistWithBLOBs record, @Param("example") EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") EmailProductlistWithBLOBs record, @Param("example") EmailProductlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_EmailProductlist
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") EmailProductlist record, @Param("example") EmailProductlistExample example);
}