package com.markus.mybatis.mapping;

/**
 * @author: markus
 * @date: 2024/10/10 22:29
 * @Description: SQL 指令类型
 * @Blog: https://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
public enum SqlCommandType {
    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 删除
     */
    DELETE,
    /**
     * 查询
     */
    SELECT,
    ;

}
