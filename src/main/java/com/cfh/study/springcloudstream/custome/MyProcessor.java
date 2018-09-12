package com.cfh.study.springcloudstream.custome;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:02
 * @Description: 自定义输入输出流
 */
@Component
public interface MyProcessor {
    String INPUT_MY = "inputMy";
    String OUTPUT_MY = "outputMy";

    @Input(MyProcessor.INPUT_MY)
    public SubscribableChannel inputMy();

    @Output(MyProcessor.OUTPUT_MY)
    public MessageChannel outputMy();
}
