package com.wl.entity;

import java.io.Serializable;

/**
 * Entity - 系统权限
 *
 * @author WeiLin
 * @version 1.0
 */
public class SysPermission implements Serializable{

    private static final long serialVersionUID = -7018578305664812511L;

    private Long id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 父id
     */
    private Long parentId;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源地址
     */
    private String url;

    /**
     * 权限字符串
     */
    private String permission;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
