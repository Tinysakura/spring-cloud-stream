package com.cfh.study.springcloudstream.fallback;

import com.cfh.study.springcloudstream.custome.FallBackProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:32
 * @Description: 带消息回复的reciver
 */
@EnableBinding(FallBackProcessor.class)
public class FallBackReciver {

    @StreamListener(FallBackProcessor.FALLBACK_INPUT)
    @SendTo(FallBackProcessor.FALLBACK_OUTPUT)//回复接收到的消息，回复的内容为返回值
    public String recive(String msg){
        System.out.println("fallback recive:"+msg);

        return "掌声送给社会人";
    }
}
