package com.xzh.messageprovider.sender;

import com.xzh.messageapi.request.Notify;
import com.xzh.messageprovider.annotation.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 发送者工厂
 *
 * @author 向振华
 * @date 2019/05/20 11:55
 */
@Component
public class SenderFactory {
    private static Map<Integer, Sender> map = new HashMap<>();

    public void method(Notify notify){
        if (!map.containsKey(notify.getSendType())){
            throw new RuntimeException("无此方法！");
        }
        map.get(notify.getSendType()).send(notify.getReceiver(),notify.getTitle(),notify.getContent());
    }

    @Autowired(required = false)
    private void init(List<Sender> senders){
        if (CollectionUtils.isEmpty(senders)){
            return;
        }
        for (Sender sender : senders) {
            //取方法上的策略类型注解
            Send annotation = AnnotationUtils.findAnnotation(sender.getClass(), Send.class);
            //将策略接口注入进map
            map.put(annotation.value(), sender);
        }
    }
}
