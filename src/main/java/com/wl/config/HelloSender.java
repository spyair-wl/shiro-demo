package com.wl.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * sender - hello
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String index) {
        String context = "hello " + index;
//        logger.debug("Sender :" + context);
        System.out.println("Sender :" + context);
        rabbitTemplate.convertAndSend("hello", context);
    }
}
