package net.app315.hydra.transfer.job.executor.server.components;

import lombok.extern.slf4j.Slf4j;
import net.app315.hydra.transfer.job.executor.common.AppConstants;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

/**
 * @Description: redis 组件
 * @Author: xiaoliang.chen
 * @Date: 2019/2/21 上午11:45
 */
@Slf4j
@Component
public class RedisComponent {


    @Autowired
    private StringRedisTemplate template;

    @PostConstruct
    public void init() {
        template.setKeySerializer(new StringRedisSerializer());
    }

    public void set(String key, String value, Long expire) {
        try {
            template.opsForValue().set(AppConstants.REDIS_PREFIX + key, value, expire, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("往redis key[{}]中存储数据时异常:{}", AppConstants.REDIS_PREFIX + key, ExceptionUtils.getStackTrace(e));
            log.error("store redis error");
        }
    }

    /**
     * 设置不过期
     *
     * @param key
     */
    public void persist(String key) {
        template.persist(AppConstants.REDIS_PREFIX + key);
    }

    public void del(String key) {
        try {
            template.delete(AppConstants.REDIS_PREFIX + key);
        } catch (Exception e) {
            log.error("往redis key[{}]中删除数据[{}]时异常:{}", key, ExceptionUtils.getStackTrace(e));
        }
    }

    public Object get(String key) {
        try {
            return template.opsForValue().get(AppConstants.REDIS_PREFIX + key);
        } catch (Throwable e) {
            log.error("从redis获取key[{}]值时异常:{}", AppConstants.REDIS_PREFIX + key, ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

    public void flushKeyExpireTime(String key, Long time) {
        try {
            template.expire(AppConstants.REDIS_PREFIX + key, time, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("重新设置key[{}]的过期时间时异常:{},", AppConstants.REDIS_PREFIX + key, ExceptionUtils.getStackTrace(e));
        }
    }

}
