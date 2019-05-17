package com.xzh.messageprovider.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 配置文件
 * @author 向振华
 * @date 2019/05/17 15:17
 */
@Data
@RefreshScope//自动刷新配置文件
@Component
public class Config {

    /**环境*/
    @Value("${spring.profiles.active}")
    private String active;

    /**邮箱配置*/
    @Value("${spring.mail.username}")
    private String mailUsername;
    @Value("${mail.recevicer}")
    private String mailRecevicer;
}
