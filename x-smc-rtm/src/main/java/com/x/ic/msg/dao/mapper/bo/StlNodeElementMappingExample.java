package com.x.ic.msg.dao.mapper.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StlNodeElementMappingExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public StlNodeElementMappingExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andMapperIdIsNull() {
			addCriterion("MAPPER_ID is null");
			return (Criteria) this;
		}

		public Criteria andMapperIdIsNotNull() {
			addCriterion("MAPPER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andMapperIdEqualTo(Long value) {
			addCriterion("MAPPER_ID =", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdNotEqualTo(Long value) {
			addCriterion("MAPPER_ID <>", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdGreaterThan(Long value) {
			addCriterion("MAPPER_ID >", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdGreaterThanOrEqualTo(Long value) {
			addCriterion("MAPPER_ID >=", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdLessThan(Long value) {
			addCriterion("MAPPER_ID <", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdLessThanOrEqualTo(Long value) {
			addCriterion("MAPPER_ID <=", value, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdIn(List<Long> values) {
			addCriterion("MAPPER_ID in", values, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdNotIn(List<Long> values) {
			addCriterion("MAPPER_ID not in", values, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdBetween(Long value1, Long value2) {
			addCriterion("MAPPER_ID between", value1, value2, "mapperId");
			return (Criteria) this;
		}

		public Criteria andMapperIdNotBetween(Long value1, Long value2) {
			addCriterion("MAPPER_ID not between", value1, value2, "mapperId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdIsNull() {
			addCriterion("SRC_NODE_DESC_ID is null");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdIsNotNull() {
			addCriterion("SRC_NODE_DESC_ID is not null");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdEqualTo(Long value) {
			addCriterion("SRC_NODE_DESC_ID =", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdNotEqualTo(Long value) {
			addCriterion("SRC_NODE_DESC_ID <>", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdGreaterThan(Long value) {
			addCriterion("SRC_NODE_DESC_ID >", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdGreaterThanOrEqualTo(Long value) {
			addCriterion("SRC_NODE_DESC_ID >=", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdLessThan(Long value) {
			addCriterion("SRC_NODE_DESC_ID <", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdLessThanOrEqualTo(Long value) {
			addCriterion("SRC_NODE_DESC_ID <=", value, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdIn(List<Long> values) {
			addCriterion("SRC_NODE_DESC_ID in", values, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdNotIn(List<Long> values) {
			addCriterion("SRC_NODE_DESC_ID not in", values, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdBetween(Long value1, Long value2) {
			addCriterion("SRC_NODE_DESC_ID between", value1, value2, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andSrcNodeDescIdNotBetween(Long value1, Long value2) {
			addCriterion("SRC_NODE_DESC_ID not between", value1, value2, "srcNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdIsNull() {
			addCriterion("TAR_NODE_DESC_ID is null");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdIsNotNull() {
			addCriterion("TAR_NODE_DESC_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdEqualTo(Long value) {
			addCriterion("TAR_NODE_DESC_ID =", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdNotEqualTo(Long value) {
			addCriterion("TAR_NODE_DESC_ID <>", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdGreaterThan(Long value) {
			addCriterion("TAR_NODE_DESC_ID >", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdGreaterThanOrEqualTo(Long value) {
			addCriterion("TAR_NODE_DESC_ID >=", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdLessThan(Long value) {
			addCriterion("TAR_NODE_DESC_ID <", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdLessThanOrEqualTo(Long value) {
			addCriterion("TAR_NODE_DESC_ID <=", value, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdIn(List<Long> values) {
			addCriterion("TAR_NODE_DESC_ID in", values, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdNotIn(List<Long> values) {
			addCriterion("TAR_NODE_DESC_ID not in", values, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdBetween(Long value1, Long value2) {
			addCriterion("TAR_NODE_DESC_ID between", value1, value2, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andTarNodeDescIdNotBetween(Long value1, Long value2) {
			addCriterion("TAR_NODE_DESC_ID not between", value1, value2, "tarNodeDescId");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("CREATE_TIME =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("CREATE_TIME <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("CREATE_TIME >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("CREATE_TIME <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("CREATE_TIME in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("CREATE_TIME not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andTenantIdIsNull() {
			addCriterion("TENANT_ID is null");
			return (Criteria) this;
		}

		public Criteria andTenantIdIsNotNull() {
			addCriterion("TENANT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTenantIdEqualTo(String value) {
			addCriterion("TENANT_ID =", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotEqualTo(String value) {
			addCriterion("TENANT_ID <>", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdGreaterThan(String value) {
			addCriterion("TENANT_ID >", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
			addCriterion("TENANT_ID >=", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdLessThan(String value) {
			addCriterion("TENANT_ID <", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdLessThanOrEqualTo(String value) {
			addCriterion("TENANT_ID <=", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdLike(String value) {
			addCriterion("TENANT_ID like", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotLike(String value) {
			addCriterion("TENANT_ID not like", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdIn(List<String> values) {
			addCriterion("TENANT_ID in", values, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotIn(List<String> values) {
			addCriterion("TENANT_ID not in", values, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdBetween(String value1, String value2) {
			addCriterion("TENANT_ID between", value1, value2, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotBetween(String value1, String value2) {
			addCriterion("TENANT_ID not between", value1, value2, "tenantId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdIsNull() {
			addCriterion("POLICY_ID is null");
			return (Criteria) this;
		}

		public Criteria andPolicyIdIsNotNull() {
			addCriterion("POLICY_ID is not null");
			return (Criteria) this;
		}

		public Criteria andPolicyIdEqualTo(Long value) {
			addCriterion("POLICY_ID =", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdNotEqualTo(Long value) {
			addCriterion("POLICY_ID <>", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdGreaterThan(Long value) {
			addCriterion("POLICY_ID >", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdGreaterThanOrEqualTo(Long value) {
			addCriterion("POLICY_ID >=", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdLessThan(Long value) {
			addCriterion("POLICY_ID <", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdLessThanOrEqualTo(Long value) {
			addCriterion("POLICY_ID <=", value, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdIn(List<Long> values) {
			addCriterion("POLICY_ID in", values, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdNotIn(List<Long> values) {
			addCriterion("POLICY_ID not in", values, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdBetween(Long value1, Long value2) {
			addCriterion("POLICY_ID between", value1, value2, "policyId");
			return (Criteria) this;
		}

		public Criteria andPolicyIdNotBetween(Long value1, Long value2) {
			addCriterion("POLICY_ID not between", value1, value2, "policyId");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("STATE is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("STATE is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("STATE =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("STATE <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("STATE >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("STATE >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("STATE <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("STATE <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("STATE like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("STATE not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("STATE in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("STATE not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("STATE between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("STATE not between", value1, value2, "state");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table stl_node_element_mapping
	 * @mbg.generated  Wed Jun 13 15:17:56 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stl_node_element_mapping
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 13 11:20:10 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}