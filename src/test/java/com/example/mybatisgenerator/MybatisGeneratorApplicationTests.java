package com.example.mybatisgenerator;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisgenerator.entity.User;
import com.example.mybatisgenerator.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisGeneratorApplicationTests {
@Autowired
private UserService userService;
    @Test
    public void contextLoads() {
        Page<User> userPage = new Page<>();
        userPage.setSize(1);
        userPage.setCurrent(3);
        IPage<User> allUser = userService.findAllUser(userPage);
        System.out.println(allUser.getRecords());
    }

}
