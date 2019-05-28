package com.wl.entity;

import java.io.Serializable;

/**
 * entity - 用户权限
 *
 * @author WeiLin
 * @version 1.0
 */
public class SysUserPermission implements Serializable{
    private static final long serialVersionUID = 7053206339496081213L;

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 权限id
     */
    private Long permissionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }
}
