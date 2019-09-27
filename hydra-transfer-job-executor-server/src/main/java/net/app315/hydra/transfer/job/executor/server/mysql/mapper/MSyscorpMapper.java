package net.app315.hydra.transfer.job.executor.server.mysql.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.app315.hydra.transfer.job.executor.server.mysql.pojo.MSysCorp;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tingfeng.jiang
 * @since 2019-09-27
 */
@DS("master")
public interface MSyscorpMapper extends BaseMapper<MSysCorp> {

}
