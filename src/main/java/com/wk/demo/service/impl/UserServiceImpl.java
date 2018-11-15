package com.wk.demo.service.impl;

import bean.UserEntity;
import com.wk.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by wangkang04 on 2018/8/31
 **/
@Service("userService")
public class UserServiceImpl implements IUserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserEntity getUser(String name, int age) {
        logger.info("getUser-->name:{},age:{}",name,age);
        UserEntity entity = new UserEntity();
        entity.setAge(age);
        entity.setName(name);
        return entity;
    }
}
