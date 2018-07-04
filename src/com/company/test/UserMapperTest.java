package com.company.test;

import com.company.mapper.UserMapper;
import com.company.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by txwhd on 2018/7/2.
 */

public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =  userMapper.findUserById(4);
        System.out.println(user.toString());
        //提交事务
        sqlSession.close();
    }

    @Test
    public void findUserByIdMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =  userMapper.findUserByIdMap(4);
        System.out.println(user.toString());
        //提交事务
        sqlSession.close();
    }

    @Test
    public void findUserByName() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users =  userMapper.findUserByName("王小二");
        System.out.println(users);
        //提交事务
        sqlSession.close();
    }

    @Test
    public void insertUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("dingding");
        user.setAddress("杭州");
        user.setBirsday(new Date());
        userMapper.insertUser(user);
        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void deleteUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(5);
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("dingding");
        user.setAddress("杭州");
        userMapper.updateUser(user);
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }



}
