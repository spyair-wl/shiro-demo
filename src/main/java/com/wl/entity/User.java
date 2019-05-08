package com.wl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Entity - 用户
 *
 * @author WeiLin
 * @version 1.0
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -2784756371645091409L;

    /**
     * id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 用户名
     */
    @Column(nullable = false, unique = true)
    private String userName;

    /**
     * 密码
     */
    @Column(nullable = false)
    private String password;

    /**
     * 电话
     */
    @Column(nullable = false, unique = true)
    private String phone;

    /**
     * 昵称
     */
    @Column(nullable = true, unique = true)
    private String nickName;

    /**
     * 注册时间
     */
    @Column(nullable = false)
    private Date regTime;

    public User() {
    }

    public User(String userName, String password, String phone, String nickName, Date regTime) {
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
