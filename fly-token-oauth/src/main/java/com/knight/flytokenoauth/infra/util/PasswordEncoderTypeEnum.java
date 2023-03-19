package com.knight.flytokenoauth.infra.util;

import lombok.Getter;

/**
 * <p>
 * 加密模式
 * </p>
 * 
 * @author knigh-jzc 2023/03/17 19:14
 */
public enum PasswordEncoderTypeEnum {
    BCRYPT("{bcrypt}","bcry加密"),
    NOOP("{noop}","不加密");

    @Getter
    private String prefix;

    PasswordEncoderTypeEnum(String prefix,String desc){
        this.prefix=prefix;
    }

}
