package com.ybh.front.mapper;

import com.ybh.front.model.Product_Email;
import com.ybh.front.model.Product_EmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_EmailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Product_EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Product_EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Product_Email record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Product_Email record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_Email> selectByExample(Product_EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product_Email record, @Param("example") Product_EmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_Email
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Product_Email record, @Param("example") Product_EmailExample example);
}