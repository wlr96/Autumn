package com.autumnframework.login.dao1;

import com.autumnframework.login.model.po.Role;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Sep 06 09:53:56 CST 2017
     */
    int updateByPrimaryKey(Role record);
}