package com.wl.dao.springboot;

import com.wl.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Dao - 用户
 *
 * @author WeiLin
 * @version 1.0
 */
@Repository
public interface UserDao {

    User getById(@Param("id") Long id);

    User findByUsername(@Param("username") String username);
}
