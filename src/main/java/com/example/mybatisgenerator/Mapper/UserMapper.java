package com.example.mybatisgenerator.Mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisgenerator.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: dcx
 * @program: demo
 * @create: 2019-06-02 14:02
 */
@Repository
public interface UserMapper {
    IPage<User> findAllUser(Page page);
}
