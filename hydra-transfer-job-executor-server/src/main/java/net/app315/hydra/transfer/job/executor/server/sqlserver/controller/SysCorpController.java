package net.app315.hydra.transfer.job.executor.server.sqlserver.controller;

import net.app315.hydra.transfer.job.executor.server.sqlserver.service.SysCorpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/27
 */
@RestController
public class SysCorpController {

    @Autowired
    private SysCorpService sysCorpService;

    @RequestMapping("/test")
    public Object test() {
        return sysCorpService.list();
    }
}
