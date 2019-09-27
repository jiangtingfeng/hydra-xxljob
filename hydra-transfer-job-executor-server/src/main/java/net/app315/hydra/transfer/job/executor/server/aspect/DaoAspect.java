package net.app315.hydra.transfer.job.executor.server.aspect;

import lombok.extern.slf4j.Slf4j;
import net.app315.hydra.transfer.job.executor.server.util.AspectUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Description:    DAO 切面
 * @Author:         xiaoliang.chen
 * @Date:     2019/2/21 上午11:45
 */
@Aspect
@Slf4j
@Component
public class DaoAspect {

    @Around("execution(public * net.app315.hydra.transfer.job.executor.server.mysql.mapper.*Mapper.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        return AspectUtil.logAround(joinPoint , 500L);
    }
}
