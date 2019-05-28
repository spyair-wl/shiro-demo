package com.wl.dao.springboot;

import com.wl.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao - 用户角色
 *
 * @author WeiLin
 * @version 1.0
 */
@Repository
public interface SysUserRoleDao {

    /**
     * 通过用户id获取用户角色
     *
     * @param userId
     * @return
     */
    List<SysRole> findByUserId(Long userId);
}
