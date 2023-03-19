package com.knight.flytokenoauth.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试login
 * </p>
 *
 * @author zhichao.jiang01@hand-china.com 2023/03/17 18:37
 */
@RestController
public class TestLoginController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
