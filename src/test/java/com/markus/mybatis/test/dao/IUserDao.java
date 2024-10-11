package com.markus.mybatis.test.dao;

/**
 * @author: markus
 * @date: 2024/10/9 21:49
 * @Description:
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public interface IUserDao {
    String queryUserName(String uId);

    Integer queryUserAge(String uId);

    String queryUserInfoById(String uId);
}
