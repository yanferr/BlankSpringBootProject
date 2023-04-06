package com.yanferr.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yanferr.user.common.utils.PageUtils;
import com.yanferr.user.entity.UserEntity;

import java.util.Map;

/**
 * 系统用户表
 *
 * @author ${author}
 * @email ${email}
 * @date 2023-04-05 10:08:07
 */
public interface UserService extends IService<UserEntity> {
    PageUtils queryPage(Map<String, Object> params);

    void updateNameById(long id, String name);
}

