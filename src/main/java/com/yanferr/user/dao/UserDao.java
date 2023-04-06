package com.yanferr.user.dao;

import com.yanferr.user.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 系统用户表
 * 
 * @author ${author}
 * @email ${email}
 * @date 2023-04-05 10:08:07
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
    void updateUserNameById(@Param("id") Long catId, @Param("name")String name);
}
