package com.wl.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Entity - 用户
 *
 * @author WeiLin
 * @version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = -2784756371645091409L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 注册时间
     */
    private Date regTime;

    public User() {
    }

    public User(Long id, String userName, String password, String phone, String nickName, Date regTime) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.nickName = nickName;
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}
