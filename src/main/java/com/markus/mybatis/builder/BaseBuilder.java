package com.markus.mybatis.builder;

import com.markus.mybatis.session.Configuration;

/**
 * @author: markus
 * @date: 2024/10/10 22:23
 * @Description: 构造器的基类，建造者模式
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public abstract class BaseBuilder {
    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
