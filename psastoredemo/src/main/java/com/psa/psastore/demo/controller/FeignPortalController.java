package com.psa.psastore.demo.controller;

import com.psa.psastore.demo.service.FeignPortalService;
import com.psa.psastore.common.api.CommonResult;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign调用psastoreweb接口示例
 * Created by macro on 2019/10/18.
 */
@Tag(name = "FeignPortalController", description = "Feign调用psastoreweb接口示例")
@RestController
@RequestMapping("/feign/portal")
public class FeignPortalController {

    @Autowired
    private FeignPortalService portalService;

    @Operation(summary = "前台会员列表登录")
    @PostMapping("/login")
    public CommonResult login(@RequestParam String username, @RequestParam String password) {
        return portalService.login(username,password);
    }

    @Operation(summary = "获取购物车列表")
    @GetMapping("/cartList")
    public CommonResult cartList() {
        return portalService.list();
    }
}
