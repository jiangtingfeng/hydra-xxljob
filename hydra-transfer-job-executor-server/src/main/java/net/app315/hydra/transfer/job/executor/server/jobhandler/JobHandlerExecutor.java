package net.app315.hydra.transfer.job.executor.server.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/27
 */
@JobHandler(value="executorJobHandler")
@Component
public class JobHandlerExecutor extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        XxlJobLogger.log("XXL-JOB, Hello World.");
        return SUCCESS;
    }
}
