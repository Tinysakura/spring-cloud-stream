package com.cfh.study.springcloudstream.reciver;

import com.cfh.study.springcloudstream.sender.SinkSender;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @Author: cfh
 * @Date: 2018/9/12 15:58
 * @Description:
 */
@EnableBinding({Sink.class,SinkSender.class})//可以将Sink与Source的组合理解为一个管道，管道中有两个方法可以放入和取出消息
public class FirstReciver {

    @StreamListener(Sink.INPUT)//监听Input这个管道，从中取消息进行响应
    public void recive(Message<String> message){
        System.out.println(message.getPayload());
    }
}
