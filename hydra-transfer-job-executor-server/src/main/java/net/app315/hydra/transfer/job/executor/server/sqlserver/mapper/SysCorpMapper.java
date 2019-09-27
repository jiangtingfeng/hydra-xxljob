package net.app315.hydra.transfer.job.executor.server.sqlserver.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.app315.hydra.transfer.job.executor.server.sqlserver.pojo.SysCorp;

@DS("secondary")
public interface SysCorpMapper extends BaseMapper<SysCorp> {

}
