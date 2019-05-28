package com.wl.dao.springboot;

import com.wl.entity.SysPermission;
import com.wl.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Dao - 用户权限
 *
 * @author WeiLin
 * @version 1.0
 */
@Repository
public interface SysUserPermissionDao {

    /**
     * 通过角色获取角色下面的所有权限
     *
     * @param roleId
     * @return
     */
    List<SysPermission> findByRole(Long roleId);
}
