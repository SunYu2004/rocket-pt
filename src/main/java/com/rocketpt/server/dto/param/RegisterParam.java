package com.rocketpt.server.dto.param;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 注册参数
 *
 * @author pt
 */
@Data
@Schema(description = "注册表单")
public class RegisterParam {

    /**
     * 注册类型
     * <p>
     * 1.开放注册
     * 2.受邀注册
     * 3.自助答题注册
     */
    @Schema(description = "注册类型")
    @NotNull(message = "注册类型 不能为空")
    private Integer type;

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    @NotBlank(message = "用户名 不能为空")
    private String username;

    /**
     * 昵称
     */
    @Schema(description = "昵称")
    @NotBlank(message = "昵称 不能为空")
    private String nickname;

    @NotBlank(message = "email 不能为空")
    @Email(message = "email 地址不正确")
    private String email;

    @Schema(description = "password")
    @NotBlank(message = "password 不能为空")
    private String password;

    /**
     * 验证码uuid
     */
    @Schema(description = "验证码uuid")
    @NotBlank(message = "验证码uuid 不能为空")
    private String uuid;
    /**
     * 验证码
     */
    @NotNull
    @Schema(description = "验证码")
    @NotBlank(message = "验证码 不能为空")
    private String code;

    /**
     * 邀请码
     */
    @Schema(description = "邀请码")
    private String invitationCode;

    /**
     * 国家地区
     */
    @Schema(description = "国家地区")
    private String country;

    /**
     * 性别
     * 0 男
     * 1 女
     * 2 其他
     */
    @Schema(description = "性别 0 男 1 女 2 其他")
    private Integer sex;
}
