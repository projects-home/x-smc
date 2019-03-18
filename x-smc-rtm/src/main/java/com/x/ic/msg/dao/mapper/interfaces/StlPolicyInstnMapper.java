package com.x.ic.msg.dao.mapper.interfaces;

import com.x.ic.msg.dao.mapper.bo.StlPolicyInstn;
import com.x.ic.msg.dao.mapper.bo.StlPolicyInstnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StlPolicyInstnMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	long countByExample(StlPolicyInstnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int deleteByExample(StlPolicyInstnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int deleteByPrimaryKey(String policyInstnId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int insert(StlPolicyInstn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int insertSelective(StlPolicyInstn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	List<StlPolicyInstn> selectByExample(StlPolicyInstnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	StlPolicyInstn selectByPrimaryKey(String policyInstnId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int updateByExampleSelective(@Param("record") StlPolicyInstn record,
			@Param("example") StlPolicyInstnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int updateByExample(@Param("record") StlPolicyInstn record, @Param("example") StlPolicyInstnExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int updateByPrimaryKeySelective(StlPolicyInstn record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_policy_instn
	 * @mbg.generated  Thu Aug 09 16:29:18 CST 2018
	 */
	int updateByPrimaryKey(StlPolicyInstn record);
}