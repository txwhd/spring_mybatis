package com.company;

import com.company.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Main {

    //根据ID查询用户信息

    @Test
    public void findUserByIdTest() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //通过sqlSession操作数据库
        User user = sqlSession.selectOne("test.findUserById",1);

        System.out.println(user.toString());

        sqlSession.close();

    }

    @Test

    public void findUserByNameTest() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //通过sqlSession操作数据库
        List<User> users = sqlSession.selectList("test.findUserByName","ding");

        System.out.println(users.toString());

        sqlSession.close();

    }

    @Test
    public void insertUserTest() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //生成插入数据
        User user = new User();
        user.setAddress("浙江杭州");
        user.setName("王小二");
        user.setBirsday(new Date());

        //通过sqlSession操作数据库
        sqlSession.insert("test.insertUser",user);

        System.out.println("插入user的ID值"+user.getId());

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

    //删除用户
    @Test
    public void deleteUserTest() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //通过sqlSession操作数据库
        sqlSession.insert("test.deleteUser",2);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }


    //更新用户
    @Test
    public void updateUserTest() throws IOException {

        //mybatis 配置文件
        String resource = "SqlMapperConfig.xml";

        //配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建会话工厂
        SqlSessionFactory sqlSessionFactory =  new SqlSessionFactoryBuilder().build(inputStream);

        //通过工厂得到sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //生成插入数据
        User user = new User();
        user.setId(4);
        user.setAddress("浙江杭州");
        user.setName("王小二");
        user.setBirsday(new Date());

        //通过sqlSession操作数据库
        sqlSession.insert("test.updateUser",user);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

}
