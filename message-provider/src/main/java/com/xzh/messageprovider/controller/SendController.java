package com.xzh.messageprovider.controller;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import com.xzh.messageapi.service.SendService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 消息通知服务
 *
 * @author 向振华
 * @date 2019/05/17 15:31
 */
@Api(tags = "通知")
@RequestMapping("send")
@RestController
public class SendController implements SendService {

    @Resource
    private SendService sendService;

    @Override
    public ResponseMessage send(@RequestBody Notify notify) {
        return sendService.send(notify);
    }
}
