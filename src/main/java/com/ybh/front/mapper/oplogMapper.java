package com.ybh.front.mapper;

import com.ybh.front.model.oplog;
import com.ybh.front.model.oplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface oplogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(oplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(oplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<oplog> selectByExampleWithBLOBs(oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<oplog> selectByExample(oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") oplog record, @Param("example") oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") oplog record, @Param("example") oplogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_oplog
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") oplog record, @Param("example") oplogExample example);
}