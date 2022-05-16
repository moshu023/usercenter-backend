package com.yhh.usercenterbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yhh.usercenterbackend.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
 * @author masteryhh
 * @description 用户服务 针对表【user(用户)】的数据库操作Service
 * @createDate 2022-05-08 19:06:51
 */
public interface UserService extends IService<User> {

    /**
     * @Description 账户注册
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * @Description 系统登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 请求
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * @Description 用户脱敏
     * @param originUser 原始用户对象实例
     */
    User getSafetyUser(User originUser);

    /**
     * @Description 用户注销
     * @param request 请求
     */
    String userLogout(HttpServletRequest request);
}
