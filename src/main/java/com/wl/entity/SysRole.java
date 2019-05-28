package com.wl.entity;

import java.io.Serializable;

/**
 * Entity - 系统角色
 *
 * @author WeiLin
 * @version 1.0
 */
public class SysRole implements Serializable {

    private static final long serialVersionUID = 8892169177831891561L;
    
    private Long id;

    /**
     * 角色标识
     */
    private String role;

    /**
     * 角色描述
     */
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
