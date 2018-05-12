package com.ybh.front.mapper;

import com.ybh.front.model.IDCIP;
import com.ybh.front.model.IDCIPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IDCIPMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(IDCIPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(IDCIPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(IDCIP record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(IDCIP record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<IDCIP> selectByExample(IDCIPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") IDCIP record, @Param("example") IDCIPExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_IDCIP
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") IDCIP record, @Param("example") IDCIPExample example);
}