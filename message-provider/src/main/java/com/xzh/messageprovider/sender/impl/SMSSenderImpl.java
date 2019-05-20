package com.xzh.messageprovider.sender.impl;

import com.xzh.messageprovider.annotation.Send;
import com.xzh.messageprovider.sender.Sender;
import org.springframework.stereotype.Component;

/**
 * 短信发送者
 *
 * @author 向振华
 * @date 2019/05/20 13:13
 */
@Send(1)
@Component
public class SMSSenderImpl implements Sender {
    @Override
    public void send(String receiver, String title, String content) {
        System.out.println("短信已发！"+receiver+title+content);
    }
}
