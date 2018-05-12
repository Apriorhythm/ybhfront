package com.ybh.front.mapper;

import com.ybh.front.model.Product_CDN;
import com.ybh.front.model.Product_CDNExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_CDNMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Product_CDN record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Product_CDN record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_CDN> selectByExampleWithBLOBs(Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_CDN> selectByExample(Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product_CDN record, @Param("example") Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Product_CDN record, @Param("example") Product_CDNExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_CDN
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Product_CDN record, @Param("example") Product_CDNExample example);
}