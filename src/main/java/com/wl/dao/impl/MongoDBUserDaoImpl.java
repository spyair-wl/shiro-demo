package com.wl.dao.impl;

import com.mongodb.client.result.UpdateResult;
import com.wl.dao.springboot.MongoDBUserDao;
import com.wl.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * DaoImpl - mongodb用户操作实现类
 *
 * @author WeiLin
 * @version 1.0
 */
@Component
public class MongoDBUserDaoImpl implements MongoDBUserDao {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public User findUserByNickName(String nickName) {
        Query query = new Query(Criteria.where("nickName").is(nickName));
        return mongoTemplate.findOne(query, User.class);
    }

    @Override
    public long updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("nickName", user.getNickName()).set("passWord", user.getPassword()).set("id",user.getId());
        //更新查询返回结果集的第一条
        UpdateResult result = mongoTemplate.updateFirst(query, update, User.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
        if (result != null) {
            return result.getMatchedCount();
        } else {
            return 0;
        }
    }

    @Override
    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,User.class);
    }
}
