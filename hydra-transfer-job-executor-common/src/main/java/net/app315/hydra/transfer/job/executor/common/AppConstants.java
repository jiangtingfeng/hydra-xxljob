package net.app315.hydra.transfer.job.executor.common;

/**
 * @Description:   微服务常量
 * @Author:         xiaoliang.chen
 * @Date:     2019/2/21 下午3:33
 */
public interface AppConstants {

    String SERVICE_NAME = "hydra-transfer-job-executor";

    String VERSION = "v1";

    String PATH = SERVICE_NAME + "/" + "api" + "/" + VERSION + "/";
    /**
     * redis中使用的key前缀（不用的微服务请保持不同，建议使用微服务名）
     */
    String REDIS_PREFIX = "transferJobExecutor:";
}
