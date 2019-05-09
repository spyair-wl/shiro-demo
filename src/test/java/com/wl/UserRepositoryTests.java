package com.wl;

import com.wl.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Tests - 用户服务
 *
 * @author WeiLin
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Autowired
//    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
//        userRepository.save(new User("aa1","aa123456","15659800196","aa",new Date()));
//        userRepository.save(new User("bb2","bb123456","15659800197","bb",new Date()));
//        userRepository.save(new User("cc3","cc123456","15659800198","cc",new Date()));
//        Assert.assertEquals(3, userRepository.findAll().size());
//        System.out.println(userRepository.findByUserNameOrPhone("bb", "15659800197").getNickName());
//        Assert.assertEquals("bb", userRepository.findByUserNameOrPhone("bb", "15659800197").getNickName());
//        userRepository.delete(userRepository.findByUserName("aa1"));
    }

}
