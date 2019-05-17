package com.xzh.messageprovider.sender;

/**
 * 邮件发送者
 *
 * @author 向振华
 * @date 2019/05/17 15:17
 */
public interface MailsSender {
    void send(String mailbox, String title, String content);
}
