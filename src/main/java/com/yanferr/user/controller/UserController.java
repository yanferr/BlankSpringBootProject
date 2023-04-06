package com.yanferr.user.controller;

import com.yanferr.user.common.utils.PageUtils;
import com.yanferr.user.common.utils.R;
import com.yanferr.user.entity.UserEntity;
import com.yanferr.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 系统用户表
 *
 * @author ${author}
 * @email ${email}
 * @date 2023-04-05 10:08:07
 */
@RestController
@RequestMapping("user/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/updateNameById")
    public R updateNameById(@RequestBody UserEntity user) {
        userService.updateNameById(user.getId(), user.getName());
        return R.ok();
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = userService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id) {
        UserEntity user = userService.getById(id);

        return R.ok().put("user", user);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserEntity user) {
        userService.save(user);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserEntity user) {
        userService.updateById(user);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids) {
        userService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
