package com.markus.mybatis.session;

/**
 * @author: markus
 * @date: 2024/10/9 22:07
 * @Description: 定义用来执行 SQL、获取映射器对象以及管理实务操作的标准接口
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public interface SqlSession {
    /**
     * 根据指定的 SqlId 获取一条记录的封装对象
     *
     * @param statement
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement);

    /**
     * 根据指定的SqlID获取一条记录的封装对象，只不过这个方法容许我们可以给sql传递一些参数
     * 一般在实际使用中，这个参数传递的是pojo，或者Map或者ImmutableMap
     *
     * @param statement
     * @param parameter
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement, Object parameter);

    /**
     *
     * @param type
     * @return
     * @param <T>
     */
    <T> T getMapper(Class<T> type);

    Configuration getConfiguration();
}
