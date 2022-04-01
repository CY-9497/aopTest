package com.ch.dao;

public interface UserDao {
    void transferOut(String username, Double m);
    void transferIn(String username, Double m);
}
