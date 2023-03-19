package com.knight.flytokengateway.infra.util;


import cn.hutool.json.JSONUtil;
import com.knight.flytokenoauth.infra.util.R;
import com.knight.flytokenoauth.infra.util.ResultCode;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.server.reactive.ServerHttpResponse;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

/**
 * <p>
 *
 * </p>
 *
 * @author knight-jzc 2023/03/18 20:37
 */
public class ResponseUtils {

    public static Mono<Void> writeErrorInfo(ServerHttpResponse response, ResultCode resultCode){
        switch (resultCode){
            case ACCESS_UNAUTHORIZED:
            case TOKEN_INVALID_OR_EXPIRED:
                response.setStatusCode(HttpStatus.UNAUTHORIZED);
                break;
            case TOKEN_ACCESS_FORBIDDEN:
                response.setStatusCode(HttpStatus.FORBIDDEN);
                break;
            default:
                response.setStatusCode(HttpStatus.BAD_REQUEST);
                break;
        }
        response.getHeaders().set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        response.getHeaders().set("Access-Control-Allow-Origin", "*");
        response.getHeaders().set("Cache-Control", "no-cache");
        String body = JSONUtil.toJsonStr(R.failed(resultCode));
        DataBuffer buffer = response.bufferFactory().wrap(body.getBytes(StandardCharsets.UTF_8));
        return response.writeWith(Mono.just(buffer)).doOnEach(error -> DataBufferUtils.release(buffer));
    }
}