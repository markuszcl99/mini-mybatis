package com.markus.mybatis.session;

/**
 * @author: markus
 * @date: 2024/10/9 22:08
 * @Description:
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
