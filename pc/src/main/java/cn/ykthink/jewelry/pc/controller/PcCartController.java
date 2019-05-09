package cn.ykthink.jewelry.pc.controller;

import cn.ykthink.jewelry.core.annotation.ValidatePcPermission;
import cn.ykthink.jewelry.core.annotation.validateEnums.ValidatePcPermissionEnum;
import cn.ykthink.jewelry.core.uri.SystemUri;
import cn.ykthink.jewelry.model.pc.user.vo.PcUserCartVO;
import cn.ykthink.jewelry.service.pc.impl.PcCartService;
import com.github.catalpaflat.valid.annotation.ParameterValid;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * program: jewelry
 * description:PC购物车Controller
 * author: mi
 * create: 2019-05-09 17:03
 **/
@Controller
@Api(description = SystemUri.PC_ROOT_URI_NAME + "购物车")
@RequestMapping(SystemUri.PC_ROOT_URI + "cart")
public class PcCartController {
    @Autowired
    PcCartService pcCartService;

    @ValidatePcPermission(validatePcPermissionEnum = ValidatePcPermissionEnum.PC_USER)
    @GetMapping("cart")
    @ApiOperation(value = "购物车",response = PcUserCartVO.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", dataType = "int", name = "pageNum", value = "第几页", required = false),
            @ApiImplicitParam(paramType = "query", dataType = "int", name = "pageSize", value = "显示多少条", required = false)
    })
    public ResponseEntity<Object> cart(@ParameterValid(type = Integer.class,msg = "pageNum不能为空",isMin = true) @RequestParam(defaultValue = "${jewelry.pages.page_index}") Integer pageNum,
                                       @ParameterValid(type = Integer.class, msg = "pageSize不能为空", isMin = true) @RequestParam(defaultValue = "${jewelry.pages.page_size}") Integer pageSize){
        return pcCartService.cart(pageNum,pageSize);
    }
}