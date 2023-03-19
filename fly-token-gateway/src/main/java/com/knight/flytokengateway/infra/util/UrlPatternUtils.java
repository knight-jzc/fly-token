package com.knight.flytokengateway.infra.util;

import cn.hutool.core.util.StrUtil;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;


/**
 * <p>
 *
 * </p>
 *
 * @author knight-jzc 2023/03/18 20:31
 */
public class UrlPatternUtils {
    public static boolean match(String patternUrl, String requestUrl){
        if (StrUtil.isBlank(patternUrl) || StrUtil.isBlank(requestUrl)){
            return false;
        }
        PathMatcher matcher = new AntPathMatcher();
        return matcher.match(patternUrl, requestUrl);
    }

    public static void main(String[] args) {
        System.out.println(match("/a/b/c/**","/a/b/c/**"));
    }
}
