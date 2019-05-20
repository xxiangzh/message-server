package com.xzh.messageprovider.service.impl;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import com.xzh.messageapi.service.SendService;
import com.xzh.messageprovider.sender.SenderFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 消息通知服务
 *
 * @author 向振华
 * @date 2019/05/17 15:17
 */
@Service
public class SendServiceImpl implements SendService {

    @Resource
    private SenderFactory senderFactory;

    @Override
    public ResponseMessage send(Notify notify) {
        senderFactory.method(notify);
        return new ResponseMessage<>(1,"SUCCESS",null);
    }
}
