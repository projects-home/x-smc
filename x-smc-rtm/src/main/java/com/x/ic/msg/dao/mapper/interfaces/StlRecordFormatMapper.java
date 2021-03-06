package com.x.ic.msg.dao.mapper.interfaces;

import com.x.ic.msg.dao.mapper.bo.StlRecordFormat;
import com.x.ic.msg.dao.mapper.bo.StlRecordFormatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StlRecordFormatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    long countByExample(StlRecordFormatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int deleteByExample(StlRecordFormatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int insert(StlRecordFormat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int insertSelective(StlRecordFormat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    List<StlRecordFormat> selectByExample(StlRecordFormatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    StlRecordFormat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") StlRecordFormat record, @Param("example") StlRecordFormatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByExample(@Param("record") StlRecordFormat record, @Param("example") StlRecordFormatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByPrimaryKeySelective(StlRecordFormat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phd_record_format
     *
     * @mbg.generated Tue Jun 12 14:46:39 CST 2018
     */
    int updateByPrimaryKey(StlRecordFormat record);
}