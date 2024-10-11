package com.markus.mybatis.test.demo;

import com.markus.mybatis.binding.MapperProxy;
import com.markus.mybatis.binding.MapperProxyFactory;
import com.markus.mybatis.binding.MapperRegistry;
import com.markus.mybatis.io.Resources;
import com.markus.mybatis.session.SqlSession;
import com.markus.mybatis.session.SqlSessionFactory;
import com.markus.mybatis.session.SqlSessionFactoryBuilder;
import com.markus.mybatis.session.defaults.DefaultSqlSessionFactory;
import com.markus.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
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

    private Logger logger = LoggerFactory.getLogger(TestDemo.class);

    @Test
    public void test_MapperProxyFactory() throws IOException {
        // 1. 从 SqlSessionFactory 中获取 SqlSession
        Reader reader = Resources.getResourceAsReader("mybatis-config-datasource.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        String res = userDao.queryUserInfoById("markus zhang");
        logger.info("测试结果: {}", res);
    }
}
