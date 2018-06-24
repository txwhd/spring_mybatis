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
}
