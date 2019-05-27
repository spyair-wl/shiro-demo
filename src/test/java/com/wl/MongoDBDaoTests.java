package com.wl;

import com.wl.dao.impl.MongoDBUserDaoImpl;
import com.wl.dao.springboot.MongoDBUserDao;
import com.wl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Test - mongodb操作
 *
 * @author WeiLin
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDBDaoTests {

    @Autowired
    private MongoDBUserDaoImpl mongoDBUserDao;

    @Test
    public void saveUser() throws Exception {
        User user = new User();
        user.setId(1L);
        user.setNickName("weilint");
        user.setPassword("123456");
        user.setPhone("15659800196");
        mongoDBUserDao.saveUser(user);
    }

    @Test
    public void getUserByUserName() throws Exception {
        User weilint = mongoDBUserDao.findUserByNickName("weilint");
        System.out.println(weilint);
    }


    @Test
    public void updateUser() throws Exception {
        User weilint = mongoDBUserDao.findUserByNickName("weilint");
        weilint.setId(1L);
        weilint.setNickName("weilin");
        mongoDBUserDao.updateUser(weilint);
    }

    @Test
    public void deleteUser() throws Exception{
        mongoDBUserDao.deleteUserById(1L);
    }
}
