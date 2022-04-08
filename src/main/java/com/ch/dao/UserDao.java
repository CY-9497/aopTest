package com.ch.dao;

/**
 * @author 青梅君
 */
public interface UserDao {
    /**
     * transfer out
     *
     * @param username 用户名
     * @param m 转账金额
     */
    void transferOut(String username, Double m);

    /**
     * transfer in
     * @param username 用户名
     * @param m 转账金额
     */
    void transferIn(String username, Double m);
}
