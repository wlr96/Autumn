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
package com.autumnframework.login.dao;


import com.autumnframework.login.domain.dto.ResourceMenuDto;
import com.autumnframework.login.domain.vo.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单资源DAO
 * 
 * @date   2016年8月15日 下午5:22:59
 * @author yangxiaobing@tomstaff.com
 *
 */
@Repository
public interface ResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    int deleteByPrimaryKey(Integer resId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    void insertSelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    Resource selectByPrimaryKey(Integer resId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cc_resource
     *
     * @mbggenerated Mon Aug 15 17:19:21 CST 2016
     */
    int updateByPrimaryKey(Resource record);


    /**
     * 资源信息COUNT
     * @param resource 资源实体
     * @return
     */
    Long selectCountResource(Resource resource);

    /**
     * 根据Id查询父级资源总记录数
     * @param resParentid 父级资源
     * @return
     */
    Long selectCountResParentByResId(Integer resParentid);
    /**
     * 资源信息分页列表显示
     * @param resource 资源实体
     * @return
     */
    List<Resource> selectResourceListByPage(Resource resource);

    /**
     * 查询资源父级菜单
     * @return
     */
    List<ResourceMenuDto>selectParentIdResList();

    /**
     * 查询资源父级菜单
     * @param resParentid 父级ID
     */
    List<Resource> selectResLevelListByParentid(@Param("resParentid") Integer resParentid);

    /**
     * 查询所有菜单信息
     * @return
     */
    List<Resource> selectResourceAllList();

    /**
     *查询有效的,URL不为空的所有菜单信息
     * @return
     */
    List<Resource> selectResUrlAllList();

    /**
     * 根据菜单类型、和菜单级别查询菜单信息
     * @param resType   菜单类型
     * @param resLevel  菜单级别
     * @return
     */
    List<Resource> selectParentResListByResTypeAndResLevel(@Param("resType") Integer resType, @Param("resLevel") Integer resLevel, @Param("resId") Integer resId);

    /**
     * 根据用户Id查询用户资源菜单信息
     * @param userId 用户Id
     * @return
     */
    List<Resource> selectResListByUserId(@Param("userId") Integer userId);





}