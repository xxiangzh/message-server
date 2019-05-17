package com.xzh.messageapi.service;

import com.xzh.common.message.ResponseMessage;
import com.xzh.messageapi.request.Notify;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 消息通知服务
 * @author 向振华
 * @date 2019/05/17 15:17
 */
public interface SendService {

    @ApiOperation(value = "发送消息")
    @PostMapping("/send")
    ResponseMessage send(Notify notify);
}
