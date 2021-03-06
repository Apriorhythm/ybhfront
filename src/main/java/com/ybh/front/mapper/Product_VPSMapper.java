package com.ybh.front.mapper;

import com.ybh.front.model.Product_VPS;
import com.ybh.front.model.Product_VPSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_VPSMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Product_VPSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Product_VPSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Product_VPS record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Product_VPS record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_VPS> selectByExample(Product_VPSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product_VPS record, @Param("example") Product_VPSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_VPS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Product_VPS record, @Param("example") Product_VPSExample example);
}