package com.psa.psastore.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

/**
 * 修改用户名密码参数
 * Created by macro on 2019/10/9.
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {
    @NotEmpty
    @Schema(title = "用户名", required = true)
    private String username;
    @NotEmpty
    @Schema(title = "旧密码", required = true)
    private String oldPassword;
    @NotEmpty
    @Schema(title = "新密码", required = true)
    private String newPassword;
}
