package com.xzh.messageprovider.sender;

/**
 * 发送者
 *
 * @author 向振华
 * @date 2019/05/17 15:17
 */
public interface Sender {
    void send(String receiver, String title, String content);
}
