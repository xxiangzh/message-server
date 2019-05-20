package com.xzh.messageprovider.sender.impl;

import com.xzh.messageprovider.annotation.Send;
import com.xzh.messageprovider.sender.Sender;
import org.springframework.stereotype.Component;

/**
 * 站内信发送者
 *
 * @author 向振华
 * @date 2019/05/20 13:15
 */
@Send(2)
@Component
public class SystemSenderImpl implements Sender {
    @Override
    public void send(String receiver, String title, String content) {
        System.out.println("站内信已发！"+receiver+title+content);
    }
}
