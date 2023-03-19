package com.knight.flytokenoauth.api.controller;

import com.knight.flytokenoauth.infra.util.R;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import java.security.interfaces.RSAPublicKey;
import java.security.KeyPair;
import java.security.Principal;
import java.util.Map;

/**
 * <p>
 * 
 * </p>
 * 
 * @author zhichao.jiang01@hand-china.com 2023/03/17 20:10
 */
@RestController
@RequestMapping("/oauth")
@AllArgsConstructor
@Slf4j
public class AuthController {

    private final TokenEndpoint tokenEndpoint;
    private final KeyPair keyPair;

    @PostMapping("/token")
    public Object postAccessToken(
            Principal principal,
            @RequestParam Map<String, String> parameters
    ) throws HttpRequestMethodNotSupportedException {
        OAuth2AccessToken accessToken = tokenEndpoint.postAccessToken(principal, parameters).getBody();
        return R.ok(accessToken);
    }


    @GetMapping("/public-key")
    public Map<String,Object> getPublicKey() {
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAKey key =new RSAKey.Builder(publicKey).build();
        return new JWKSet(key).toJSONObject();
    }

}
