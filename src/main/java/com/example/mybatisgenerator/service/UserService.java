package com.example.mybatisgenerator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisgenerator.entity.User;

public interface UserService {
    IPage<User> findAllUser(Page page);
}
