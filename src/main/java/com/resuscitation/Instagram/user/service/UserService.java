package com.resuscitation.Instagram.user.service;

import com.resuscitation.Instagram.user.dto.LoginFormDto;
import com.resuscitation.Instagram.user.dto.RegisterFormDto;

public interface UserService {

    /**
     * 회원 가입 메소드
     *
     * @param registerFormDto 회원 가입 폼
     * @return JSON Web Tokens
     */
    String register(RegisterFormDto registerFormDto) throws IllegalArgumentException;

    /**
     * 이메일 중복 체크 메소드
     *
     * @param email 사용할 이메일
     * @return 사용 가능 true, 사용 불가능 false
     */
    boolean emailDuplicateCheck(String email);

    /**
     * 회원 가입 - Facebook
     *
     * @param facebookCode 회원 가입 토큰
     * @return JSON Web Tokens
     */
    String registerWithFaceBook(String facebookCode);

    /**
     * 로그인
     *
     * @param loginFormDto 로그인 폼 DTO (email, password)
     * @return JSON Web Tokens
     */
    String login(LoginFormDto loginFormDto);

    /**
     * 로그인 - Facebook
     *
     * @param facebookCode Facebook Oauth Code
     * @return JSON Web Tokens
     */
    String loginWithFacebook(String facebookCode);
}