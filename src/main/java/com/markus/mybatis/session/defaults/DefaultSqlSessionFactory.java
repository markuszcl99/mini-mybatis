package com.markus.mybatis.session.defaults;

import com.markus.mybatis.binding.MapperRegistry;
import com.markus.mybatis.session.SqlSession;
import com.markus.mybatis.session.SqlSessionFactory;

/**
 * @author: markus
 * @date: 2024/10/9 22:18
 * @Description:
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }
}
