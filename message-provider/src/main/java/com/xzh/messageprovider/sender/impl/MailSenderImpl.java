package com.xzh.messageprovider.sender.impl;

import com.xzh.messageprovider.annotation.Send;
import com.xzh.messageprovider.config.Config;
import com.xzh.messageprovider.sender.Sender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 邮件发送者
 *
 * @author 向振华
 * @date 2019/05/17 15:17
 */
@Send(3)
@Component
public class MailSenderImpl implements Sender {

    @Resource
    private Config config;

    @Resource
    private JavaMailSender javaMailSender;

    @Override
    public void send(String receiver, String title, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(config.getMailUsername());
        message.setTo(receiver);
        message.setSubject(title);
        message.setText(content);
        javaMailSender.send(message);
    }
}
