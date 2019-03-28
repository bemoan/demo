package com.xry.demo.mapper;

import com.xry.demo.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();

    User getOne(int id);

    void insert(User user);

    void update(User user);

    void delete(int id);
}