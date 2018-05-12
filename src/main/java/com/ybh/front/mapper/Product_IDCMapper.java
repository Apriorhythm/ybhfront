package com.ybh.front.mapper;

import com.ybh.front.model.Product_IDC;
import com.ybh.front.model.Product_IDCExample;
import com.ybh.front.model.Product_IDCWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_IDCMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Product_IDCWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Product_IDCWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_IDCWithBLOBs> selectByExampleWithBLOBs(Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_IDC> selectByExample(Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product_IDCWithBLOBs record, @Param("example") Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Product_IDCWithBLOBs record, @Param("example") Product_IDCExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_IDC
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Product_IDC record, @Param("example") Product_IDCExample example);
}