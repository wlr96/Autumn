/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * <p>
 * Copyright 2017 © yangxiaobing, 873559947@qq.com
 * <p>
 * This file is part of contentManagerSystem.
 * contentManagerSystem is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * contentManagerSystem is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with contentManagerSystem.  If not, see <http://www.gnu.org/licenses/>.
 * <p>
 * 这个文件是contentManagerSystem的一部分。
 * 您可以单独使用或分发这个文件，但请不要移除这个头部声明信息.
 * contentManagerSystem是一个自由软件，您可以自由分发、修改其中的源代码或者重新发布它，
 * 新的任何修改后的重新发布版必须同样在遵守GPL3或更后续的版本协议下发布.
 * 关于GPL协议的细则请参考COPYING文件，
 * 您可以在contentManagerSystem的相关目录中获得GPL协议的副本，
 * 如果没有找到，请连接到 http://www.gnu.org/licenses/ 查看。
 * <p>
 * - Author: yangxiaobing
 * - Contact: 873559947@qq.com
 * - License: GNU Lesser General Public License (GPL)
 * - source code availability: http://git.oschina.net/yangxiaobing_175/contentManagerSystem
 */
package com.autumnframework.login.dao;

import com.autumnframework.login.domain.vo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * 角色DAO
 *
 * @author yangxiaobing
 * @date 2017/7/24
 */
@Repository
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    Role selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_role
     *
     * @mbggenerated Tue Nov 29 21:23:21 CST 2016
     */
    int updateByPrimaryKey(Role record);

    /**
     * 更改角色状态
     * @param params
     */
    void updateRoleByStatus(Map<String, Object> params);
    /**
     * 查询角色总记录数
     * @param role 角色实体
     * @return
     */
    Long selectCountRole(Role role);

    /**
     * 角色信息分页列表显示
     * @param role 角色实体
     * @return
     */
    List<Role> selectRoleListByPage(Role role);

    /**
     * 角色信息列表
     * @param role 角色实体
     * @return
     */
    List<Role> selectRoleList(Role role);


    /**
     * 验证角色名称唯一性
     * @param roleName 角色名称
     * @param roleId   角色Id
     * @return
     */
    Long selectRoleNameCheck(@Param("roleName") String roleName, @Param("roleId") Integer roleId);
    /**
     * 根据用户Id查询用户所对应的角色信息
     * @param userId 用户Id
     * @return
     */
    List<Role> selectUserRolesByUserId(@Param("userId") Integer userId);

    /**
     * 查询状态为有效的所有角色信息
     * @return
     */
     List<Role>selectRoleListByStatus();

    /**
     *  查询状态为有效的待分配角色信息(已分配的角色信息除外)
     *  @param roleId 角色Id
     */
    List<Role> selectUserRoleByRoleIdList(Integer[] roleId);

    /**
     * 查询状态为有效的已分配角色信息
     * @param roleId 角色Id
     * @return
     */
    List<Role> selectDeceasedUserRoleByRoleIdList(Integer[] roleId);


}