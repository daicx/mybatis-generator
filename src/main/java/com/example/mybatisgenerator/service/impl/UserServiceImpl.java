package com.example.mybatisgenerator.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisgenerator.Mapper.UserMapper;
import com.example.mybatisgenerator.entity.User;
import com.example.mybatisgenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: dcx
 * @program: demo
 * @create: 2019-06-02 14:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public IPage<User> findAllUser(Page page) {
        return userMapper.findAllUser(page);
    }
}
