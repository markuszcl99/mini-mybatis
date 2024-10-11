package com.markus.mybatis.session.defaults;

import com.markus.mybatis.binding.MapperRegistry;
import com.markus.mybatis.mapping.MappedStatement;
import com.markus.mybatis.session.Configuration;
import com.markus.mybatis.session.SqlSession;

/**
 * @author: markus
 * @date: 2024/10/9 22:16
 * @Description:
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了!" + "方法: " + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了!" + "\n方法: " + statement + "\n入参: " + parameter + "\n待执行 SQL: " + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
