package com.yhh.usercenterbackend.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description 用户登录请求体
 * @author masterYHH Email:15223789730@163.com
 * @version 1.0
 * @date 2022/5/9 6:42
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 2567942089999293310L;

    private String userAccount;

    private String userPassword;
}
