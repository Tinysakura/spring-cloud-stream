package com.cfh.study.springcloudstream.custome;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:34
 * @Description:
 */
@Component
public interface FallBackProcessor {
    String FALLBACK_INPUT = "fallbackInput";
    String FALLBACK_OUTPUT = "fallbackOutput";

    @Input(FallBackProcessor.FALLBACK_INPUT)
    SubscribableChannel fallbackInput();

    @Output(FallBackProcessor.FALLBACK_OUTPUT)
    MessageChannel fallbackOutput();
}
