package net.app315.hydra.transfer.job.executor.server;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:    微服务入口
 * @Author:         xiaoliang.chen
 * @Date:     2019/2/21 上午11:59
 */
@Slf4j
@EnableFeignClients(basePackages = {"net.app315.hydra"})
@EnableTransactionManagement
@SpringBootApplication
@EnableApolloConfig
@ComponentScan(basePackages = {"net.app315"})
public class TransferJobExecutorApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransferJobExecutorApplication.class, args);
    }
}
