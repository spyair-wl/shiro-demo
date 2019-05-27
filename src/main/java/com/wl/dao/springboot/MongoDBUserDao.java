package com.wl.dao.springboot;

import com.wl.entity.User;

/**
 * Dao - mongodb用户操作接口类
 *
 * @author WeiLin
 * @version 1.0
 */
public interface MongoDBUserDao {

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 通过用户名搜索用户
     *
     * @param nickName
     * @return
     */
    User findUserByNickName(String nickName);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    long updateUser(User user);

    /**
     * 通过id删除用户
     *
     * @param id
     */
    void deleteUserById(Long id);
}
