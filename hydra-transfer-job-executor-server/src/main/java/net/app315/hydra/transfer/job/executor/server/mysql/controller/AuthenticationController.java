/*
 * Copyright (c) 2019-2019 杭州禺泽科技  All Rights Reserved.
 * @Title: AuthenticationController.java
 * @Author: xiaoliang.chen
 * @Date: 2019/2/21
 * @Version: V1.0
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目的
 */

package net.app315.hydra.transfer.job.executor.server.mysql.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.app315.hydra.transfer.job.executor.common.AppConstants;
import net.app315.hydra.transfer.job.executor.server.mysql.service.MSysCorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商户请求鉴权
 *
 * @author xiaoliang.chen
 * @date 2018/11/28
 */
@Slf4j
@RestController
@RequestMapping(value = AppConstants.PATH)
public class AuthenticationController {

    @Autowired
    private MSysCorpService MSysCorpService;
    @ApiOperation(value = "test", notes = "test")
    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    public String getMerchantById(@PathVariable(name = "id") int id) {
        return "test";
    }

    @RequestMapping("/check")
    public Object check() {
        return  MSysCorpService.list();
    }

}