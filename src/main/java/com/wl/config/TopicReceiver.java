package com.wl.config;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Receiver -
 *
 * @author WeiLin
 * @version 1.0
 */
@Component
@RabbitListener(queues = "topic.message")
public class TopicReceiver {

    @RabbitHandler
    public void process(String context){
        System.out.println("Topic Receiver : " + context);
    }
}
