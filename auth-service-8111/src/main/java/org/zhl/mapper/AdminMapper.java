package org.zhl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.zhl.pojo.Admin;

/**
 * <p>
 * 慕聘网运营管理系统的admin账户表，仅登录，不提供注册 Mapper 接口
 * </p>
 *
 * @author 风间影月
 * @since 2022-09-04
 */
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

}
