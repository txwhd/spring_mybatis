package com.company.mapper;

import com.company.po.User;

/**
 * Created by txwhd on 2018/7/2.
 */
public interface UserMapper {
    //根据ID查询用户信息
    public User findUserById(int id) throws Exception;

    //
}
