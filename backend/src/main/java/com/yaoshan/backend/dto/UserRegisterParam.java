package com.yaoshan.backend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserRegisterParam {
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确") // 简单手机号校验
    private String phone;

    @NotBlank(message = "密码不能为空")
    private String password; // 暂时明文，后续需加密

    @NotBlank(message = "昵称不能为空")
    private String nickname; // 注册时需填写昵称
}