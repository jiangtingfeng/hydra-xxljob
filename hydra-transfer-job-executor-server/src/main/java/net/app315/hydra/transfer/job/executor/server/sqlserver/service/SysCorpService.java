package net.app315.hydra.transfer.job.executor.server.sqlserver.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.app315.hydra.transfer.job.executor.server.sqlserver.mapper.SysCorpMapper;
import net.app315.hydra.transfer.job.executor.server.sqlserver.pojo.SysCorp;
import org.springframework.stereotype.Service;

/**
 * @author jiangtingfeng
 * @description
 * @data 2019/9/27
 */
@DS("secondary")
@Service
public class SysCorpService extends ServiceImpl<SysCorpMapper, SysCorp> {
}
