package net.app315.hydra.transfer.job.executor.server.mysql.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.app315.hydra.transfer.job.executor.server.mysql.mapper.MSyscorpMapper;
import net.app315.hydra.transfer.job.executor.server.mysql.pojo.MSysCorp;
import org.springframework.stereotype.Service;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/27
 */
@DS("master")
@Service
public class MSysCorpService extends ServiceImpl<MSyscorpMapper, MSysCorp> {

}
