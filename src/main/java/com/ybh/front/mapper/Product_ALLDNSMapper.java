package com.ybh.front.mapper;

import com.ybh.front.model.Product_ALLDNS;
import com.ybh.front.model.Product_ALLDNSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Product_ALLDNSMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    long countByExample(Product_ALLDNSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int deleteByExample(Product_ALLDNSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insert(Product_ALLDNS record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int insertSelective(Product_ALLDNS record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    List<Product_ALLDNS> selectByExample(Product_ALLDNSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product_ALLDNS record, @Param("example") Product_ALLDNSExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FreeHost_Product_ALLDNS
     *
     * @mbg.generated Fri May 11 11:16:07 CST 2018
     */
    int updateByExample(@Param("record") Product_ALLDNS record, @Param("example") Product_ALLDNSExample example);
}