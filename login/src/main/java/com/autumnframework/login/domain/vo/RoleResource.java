/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2017 © yangxiaobing, 873559947@qq.com
 *
 * This file is part of contentManagerSystem.
 * contentManagerSystem is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * contentManagerSystem is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with contentManagerSystem.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 这个文件是contentManagerSystem的一部分。
 * 您可以单独使用或分发这个文件，但请不要移除这个头部声明信息.
 * contentManagerSystem是一个自由软件，您可以自由分发、修改其中的源代码或者重新发布它，
 * 新的任何修改后的重新发布版必须同样在遵守GPL3或更后续的版本协议下发布.
 * 关于GPL协议的细则请参考COPYING文件，
 * 您可以在contentManagerSystem的相关目录中获得GPL协议的副本，
 * 如果没有找到，请连接到 http://www.gnu.org/licenses/ 查看。
 *
 * - Author: yangxiaobing
 * - Contact: 873559947@qq.com
 * - License: GNU Lesser General Public License (GPL)
 * - source code availability: http://git.oschina.net/yangxiaobing_175/contentManagerSystem
 */
package com.autumnframework.login.domain.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 角色资源关联实体
 *
 * @author yangxiaobing
 * @date 2017/7/24
 */
public class RoleResource implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.role_res_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private Integer roleResId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.role_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.resource_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private Integer resourceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.creator
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.create_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.modifier
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cc_role_resource.modifier_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    private Date modifierTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.role_res_id
     *
     * @return the value of cc_role_resource.role_res_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public Integer getRoleResId() {
        return roleResId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.role_res_id
     *
     * @param roleResId the value for cc_role_resource.role_res_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setRoleResId(Integer roleResId) {
        this.roleResId = roleResId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.role_id
     *
     * @return the value of cc_role_resource.role_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.role_id
     *
     * @param roleId the value for cc_role_resource.role_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.resource_id
     *
     * @return the value of cc_role_resource.resource_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.resource_id
     *
     * @param resourceId the value for cc_role_resource.resource_id
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.creator
     *
     * @return the value of cc_role_resource.creator
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.creator
     *
     * @param creator the value for cc_role_resource.creator
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.create_time
     *
     * @return the value of cc_role_resource.create_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.create_time
     *
     * @param createTime the value for cc_role_resource.create_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.modifier
     *
     * @return the value of cc_role_resource.modifier
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.modifier
     *
     * @param modifier the value for cc_role_resource.modifier
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cc_role_resource.modifier_time
     *
     * @return the value of cc_role_resource.modifier_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public Date getModifierTime() {
        return modifierTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cc_role_resource.modifier_time
     *
     * @param modifierTime the value for cc_role_resource.modifier_time
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    public void setModifierTime(Date modifierTime) {
        this.modifierTime = modifierTime;
    }
}