package com.x.ic.msg.dao.mapper.interfaces;

import com.x.ic.msg.dao.mapper.bo.StlNodeElementMapping;
import com.x.ic.msg.dao.mapper.bo.StlNodeElementMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StlNodeElementMappingMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	long countByExample(StlNodeElementMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int deleteByExample(StlNodeElementMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int deleteByPrimaryKey(Long mapperId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int insert(StlNodeElementMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int insertSelective(StlNodeElementMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	List<StlNodeElementMapping> selectByExample(StlNodeElementMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	StlNodeElementMapping selectByPrimaryKey(Long mapperId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int updateByExampleSelective(@Param("record") StlNodeElementMapping record,
			@Param("example") StlNodeElementMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int updateByExample(@Param("record") StlNodeElementMapping record,
			@Param("example") StlNodeElementMappingExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int updateByPrimaryKeySelective(StlNodeElementMapping record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	int updateByPrimaryKey(StlNodeElementMapping record);
}