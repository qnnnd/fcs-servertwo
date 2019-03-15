package com.example.demo.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "ribbon测试接口", description = "用于负载均衡测试")
@RequestMapping(value = "/servertwo/zuul")
public interface ZuulTestApi {

    int SUCCESS_CODE = 200;

    int ERROR_CODE = 500;

    @ApiOperation(value = "ribbon测试接口", notes = "测试接口", response = String.class, tags = {"serverone"})
    @ApiResponses(value = {@ApiResponse(code = SUCCESS_CODE, message = "成功", response = String.class),
        @ApiResponse(code = ERROR_CODE, message = "内部错误", response = String.class)})
    @RequestMapping(value = "test", method = RequestMethod.GET)
    String test() throws Exception;
}