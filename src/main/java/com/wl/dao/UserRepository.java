package com.wl.dao;

import com.wl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Dao - 用户
 *
 * @author WeiLin
 * @version 1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrPhone(String username, String phone);
}
