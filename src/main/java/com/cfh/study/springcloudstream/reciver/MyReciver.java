package com.cfh.study.springcloudstream.reciver;

import com.cfh.study.springcloudstream.My;
import com.cfh.study.springcloudstream.custome.MyProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:08
 * @Description:
 */
@EnableBinding(MyProcessor.class)
public class MyReciver {

    @StreamListener(MyProcessor.INPUT_MY)
    public void recive(Message<My> message){
        System.out.println(message.getPayload().toString());
    }
}
