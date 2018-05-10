package com.ybh.front.mapper;

import com.ybh.front.model.User;
import com.ybh.front.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    List<User> selectByExampleWithBLOBs(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_USER
     *
     * @mbg.generated Thu May 10 16:24:43 CST 2018
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}