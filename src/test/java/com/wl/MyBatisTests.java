package com.wl;

import com.wl.dao.springboot.UserDao;
import com.wl.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Tests - mybatis
 *
 * @author WeiLin
 * @version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisTests {

    @Resource
    private UserDao userDao;

    @Test
    public void Test() throws Exception {
        User user = userDao.getById(1L);
        Assert.assertEquals("wl",user.getUserName());
    }
}
