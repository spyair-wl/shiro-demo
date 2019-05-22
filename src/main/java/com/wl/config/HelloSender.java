package com.wl.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * sender - hello
 * @author Administrator
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

    public void send1(){
        String context = "hi,i am message 1";
        System.out.println("Sender :" + context);
        rabbitTemplate.convertAndSend("exchange","topic.message",context);
    }

    public void send2(){
        String context = "hi,i am message 2";
        System.out.println("Sender :" + context);
        rabbitTemplate.convertAndSend("exchange","topic.messages",context);
    }

    public void sendFanout(){
        String context = "hi,fanout msg ";
        System.out.println("Sender : " + context);
        rabbitTemplate.convertAndSend("fanoutExchange","",context);
    }

}
