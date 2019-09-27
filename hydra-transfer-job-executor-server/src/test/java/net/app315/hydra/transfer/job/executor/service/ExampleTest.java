package net.app315.hydra.transfer.job.executor.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Description:    Example Test
 * @Author:         xiaoliang.chen
 * @Date:     2019/2/21 下午2:08
 */
@Slf4j
public class ExampleTest extends BaseTest {


    @Test
    public void getIp() throws Exception {
        String ip = "117.136.90.32";
        log.info("获取IP地址:{}", ip);
    }

}