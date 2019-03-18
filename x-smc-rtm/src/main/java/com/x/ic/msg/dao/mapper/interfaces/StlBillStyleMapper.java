package com.x.ic.msg.dao.mapper.interfaces;

import com.x.ic.msg.dao.mapper.bo.StlBillStyle;
import com.x.ic.msg.dao.mapper.bo.StlBillStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StlBillStyleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    long countByExample(StlBillStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int deleteByExample(StlBillStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int deleteByPrimaryKey(Long billStyleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int insert(StlBillStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int insertSelective(StlBillStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    List<StlBillStyle> selectByExample(StlBillStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    StlBillStyle selectByPrimaryKey(Long billStyleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") StlBillStyle record, @Param("example") StlBillStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByExample(@Param("record") StlBillStyle record, @Param("example") StlBillStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByPrimaryKeySelective(StlBillStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stl_bill_style
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByPrimaryKey(StlBillStyle record);
}