package com.cfh.study.springcloudstream;

import com.cfh.study.springcloudstream.custome.FallBackProcessor;
import com.cfh.study.springcloudstream.fallback.FallBackSender;
import com.cfh.study.springcloudstream.sender.FirstSender;
import com.cfh.study.springcloudstream.sender.MySender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cfh
 * @Date: 2018/9/12 18:53
 * @Description:
 */
@RestController
public class controller {
    @Autowired
    FirstSender firstSender;

    @Autowired
    MySender mySender;

    @Autowired
    FallBackSender fallBackSender;

    @RequestMapping("/send1")
    public void send1(){
        System.out.println("send message:mmp");
        firstSender.send("mmp");
    }

    @RequestMapping("/sendMy")
    public void sendMy(){
        System.out.println("send message:my");
        My me = new My();
        me.setName("cfh");
        me.setAge("18");
        mySender.sendMy(me);
    }

    @RequestMapping("/sendWithFallback")
    public void sendFallback(){
        fallBackSender.send("小猪佩琪身上纹");
    }
}
