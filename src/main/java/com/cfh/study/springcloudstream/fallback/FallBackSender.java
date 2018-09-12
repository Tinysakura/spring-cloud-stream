package com.cfh.study.springcloudstream.fallback;

import com.cfh.study.springcloudstream.custome.FallBackProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:32
 * @Description: 接收消息回复的的Sender
 */
@EnableBinding(FallBackProcessor.class)
public class FallBackSender {
    @Autowired
    FallBackProcessor fallBackProcessor;

    public void send(String msg){
        System.out.println("fallbackSender:"+msg);
        fallBackProcessor.fallbackOutput().send(MessageBuilder.withPayload(msg).build());
    }

    @StreamListener(FallBackProcessor.FALLBACK_INPUT)
    public void reciverCallback(String callback){
        System.out.println("fallbackSender recive callbakc:"+callback);
    }
}
