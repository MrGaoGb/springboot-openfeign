package com.mrgao.demo.config;

import com.alibaba.fastjson.JSONObject;
import com.mrgao.demo.dto.ChannelReqParam;
import com.mrgao.demo.dto.UserOperate;
import feign.RequestTemplate;
import feign.codec.EncodeException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Encoder extends SpringEncoder {

    public Encoder(ObjectFactory<HttpMessageConverters> messageConverters) {
        super(messageConverters);
    }

    @Override
    public void encode(Object requestBody, Type bodyType, RequestTemplate request) throws EncodeException {
        if (requestBody instanceof UserOperate) {
            ChannelReqParam channelReqParam = new ChannelReqParam();
            channelReqParam.setVersion("1.0");
            channelReqParam.setTimestamp(System.currentTimeMillis() + "");
            channelReqParam.setData(JSONObject.toJSONString(requestBody));
            requestBody = channelReqParam;
            bodyType = new MyParameterizedType();
        }
        super.encode(requestBody, bodyType, request);
    }

    private class MyParameterizedType implements ParameterizedType {

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[0];
        }

        @Override
        public Type getRawType() {
            return ChannelReqParam.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}
