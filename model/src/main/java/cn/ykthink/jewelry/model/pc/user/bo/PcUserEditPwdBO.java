package cn.ykthink.jewelry.model.pc.user.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Author: YK
 * Title: PcUserEditPwd
 * Description: 修改密码
 * Date: 2019/5/8
 * Time: 15:09
 */
@Data
public class PcUserEditPwdBO {
    @NotBlank(message = "旧密码不能为空")
    @ApiModelProperty(value = "旧密码", name = "oldPwd", example = "", dataType = "String", required = false)
    private String oldPwd;

    @NotBlank(message = "新密码不能为空")
    @ApiModelProperty(value = "新密码", name = "newPwd", example = "", dataType = "String", required = false)
    private String newPwd;

    @ApiModelProperty(value = "验证码", name = "code", example = "", dataType = "Integer", required = false)
    private Integer code;
}
