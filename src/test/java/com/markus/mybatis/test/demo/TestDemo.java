package com.markus.mybatis.test.demo;

import com.markus.mybatis.binding.MapperProxy;
import com.markus.mybatis.binding.MapperProxyFactory;
import com.markus.mybatis.binding.MapperRegistry;
import com.markus.mybatis.session.SqlSession;
import com.markus.mybatis.session.SqlSessionFactory;
import com.markus.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.markus.mybatis.test.dao.IUserDao;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: markus
 * @date: 2024/10/9 21:50
 * @Description:
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public class TestDemo {

    @Test
    public void test_MapperProxyFactory() {
        MapperRegistry registry = new MapperRegistry();
        registry.addMappers("com.markus.mybatis.test.dao");

        SqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        String markusZhang = userDao.queryUserName("markus zhang");
        System.out.println("测试结果: " + markusZhang);
    }
}
