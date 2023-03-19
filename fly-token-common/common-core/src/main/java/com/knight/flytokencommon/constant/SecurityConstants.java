package com.knight.flytokencommon.constant;

/**
 * <p>
 * 安全验证常量
 * </p>
 *
 * @author knight-jzc 2023/03/18 21:50
 */
public interface SecurityConstants {

    /**
     * 黑名单TOKEN Key前缀
     */
    String BLACKLIST_TOKEN_PREFIX = "AUTH:BLACKLIST_TOKEN:";

    /**
     * 验证码key前缀
     */
    String VERIFY_CODE_KEY_PREFIX = "AUTH:VERIFY_CODE:";

    /**
     * 短信验证码key前缀
     */
    String SMS_CODE_PREFIX = "SMS_CODE:";

    /**
     * 接口文档 Knife4j 测试客户端ID
     */
    String TEST_CLIENT_ID = "client";

    /**
     * 系统管理 web 客户端ID
     */
    String ADMIN_CLIENT_ID = "mall-admin";

    /**
     * 移动端（H5/Android/IOS）客户端ID
     */
    String APP_CLIENT_ID = "mall-app";

    /**
     * 微信小程序客户端ID
     */
    String WEAPP_CLIENT_ID = "mall-weapp";

    /**
     * 认证前缀
     */
    String AUTHORITY_PREFIX = "AUTH:AUTHORITY:";

    /**
     * JWT认证key前缀
     */
    String JWT_AUTHORITIES_KEY = "AUTH:JWT_AUTHORITIES:";

    /**
     * JWT前缀
     */
    CharSequence JWT_PREFIX = "AUTH:JWT:";

    /**
     * JWT_PAYLOAD前缀
     */
    String JWT_PAYLOAD_KEY = "AUTH:JWT_PAYLOAD:";

    /**
     * 认证key
     */
    String AUTHORIZATION_KEY = "AUTH:AUTHORITY_KEY:";
}
