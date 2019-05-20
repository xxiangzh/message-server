package com.xzh.messageapi.request;

import com.xzh.messageapi.enums.SendType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通知
 *
 * @author 向振华
 * @date 2019/05/17 15:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notify implements Serializable {
    private static final long serialVersionUID = 4853617398753548192L;

    @ApiModelProperty(value = "发送类型",required = true)
    private Integer sendType;

    @ApiModelProperty(value = "接收者",required = true)
    private String receiver;

    @ApiModelProperty(value = "标题",required = true)
    private String title;

    @ApiModelProperty(value = "内容", required = true)
    private String content;
}
