package com.wl;

import com.wl.config.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RabbitMqTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void Hello() throws Exception {
        for (int i = 0; i < 100; i++) {
            helloSender.send(i + "");
        }
    }


    @Test
    public void TopicTest() throws Exception {
        helloSender.send1();
        helloSender.send2();
    }

    @Test
    public void FanoutTest() throws Exception {
        helloSender.sendFanout();
    }
}
