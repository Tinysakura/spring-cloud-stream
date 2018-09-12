package com.cfh.study.springcloudstream.sender;

import com.cfh.study.springcloudstream.My;
import com.cfh.study.springcloudstream.custome.MyProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:08
 * @Description:
 */
@Component
public class MySender {
    @Autowired
    MyProcessor myProcessor;

    public void sendMy(My me){
        myProcessor.outputMy().send(MessageBuilder.withPayload(me).build());
    }
}
