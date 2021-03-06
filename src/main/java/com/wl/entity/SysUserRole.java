package com.wl.entity;

import java.io.Serializable;

/**
 * entity - 用户角色表
 *
 * @author WeiLin
 * @version 1.0
 */
public class SysUserRole implements Serializable{
    private static final long serialVersionUID = 8221362741875936385L;

    private Long id;
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;


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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
