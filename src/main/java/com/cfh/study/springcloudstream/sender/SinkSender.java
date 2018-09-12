package com.cfh.study.springcloudstream.sender;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 18:45
 * @Description:
 */
@Component
public interface SinkSender {

    //通过注入的方式生成一个消息生产者（MessageChannel）,这个消息生产者生产的消息将会被放入input这个通道中
    @Output(Sink.INPUT)
    MessageChannel output();
}
