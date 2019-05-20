package com.xzh.messageapi.enums;

/**
 * 发送类型
 *
 * @author 向振华
 * @date 2019/05/20 9:22
 */
public enum SendType {

    /**
     * 短信
     */
    SMS(1),

    /**
     * 站内信
     */
    SYSTEM(2),

    /**
     * 邮件
     */
    MAIL(3);

    private Integer type;

    SendType(Integer type) {
        this.type = type;
    }

    public static SendType getType(Integer value) {
        for (SendType type : SendType.values()) {
            if (type.getType().equals(value)) {
                return type;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }
}
