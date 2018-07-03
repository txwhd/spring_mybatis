package com.company.mapper;

import com.company.po.User;

import java.util.List;

/**
 * Created by txwhd on 2018/7/2.
 */
public interface UserMapper {
    //根据ID查询用户信息
    public User findUserById(int id) throws Exception;

    //根据用户名查询用户信息
    public List<User> findUserByName(String name) throws  Exception;

    //插入用户
    public void insertUser(User user) throws Exception;

    //删除用户
    public void deleteUser(int id) throws Exception;

    //更新用户
    public  void updateUser(User user) throws Exception;
}
