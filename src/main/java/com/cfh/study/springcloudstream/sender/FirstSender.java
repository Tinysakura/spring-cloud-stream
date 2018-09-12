package com.cfh.study.springcloudstream.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 18:43
 * @Description:
 */
@Component
public class FirstSender {
    @Autowired
    SinkSender sinkSender;

    public void send(String message){
        sinkSender.output().send(MessageBuilder.withPayload(message).build());
    }


}
