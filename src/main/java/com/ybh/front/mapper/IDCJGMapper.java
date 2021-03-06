package com.ybh.front.mapper;

import com.ybh.front.model.IDCJG;
import com.ybh.front.model.IDCJGExample;
import com.ybh.front.model.IDCJGWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IDCJGMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(IDCJGWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(IDCJGWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<IDCJGWithBLOBs> selectByExampleWithBLOBs(IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<IDCJG> selectByExample(IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") IDCJGWithBLOBs record, @Param("example") IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") IDCJGWithBLOBs record, @Param("example") IDCJGExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCJG
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") IDCJG record, @Param("example") IDCJGExample example);
}