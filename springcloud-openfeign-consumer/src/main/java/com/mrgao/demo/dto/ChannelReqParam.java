package com.mrgao.demo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChannelReqParam {
    /**
     * 版本号 1.0
     */
    private String version;
    /**
     * 请求时间戳
     */
    private String timestamp;
    /**
     * 请求参数
     */
    private Object data;

}
