/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserService
 * Author:   ydy
 * Date:     2020/4/7 9:54
 * Description: 业务服务层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈业务服务层〉
 *
 * @author ydy
 * @create 2020/4/7 9:54
 * @since 1.0.0
 */
@Service
@Transactional
public class UserService {
    @Autowired
//    @Lazy
    private UserMapper userMapper;

    public List<UserEntity> getAll(){
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
        return  users;
    }

    public  UserEntity getOne(Long id){
        UserEntity entity = userMapper.getOne(id);
        return  entity;
    }

    public void insert(UserEntity user){
        userMapper.insert(user);
    }


    public void update(UserEntity user){
        userMapper.update(user);
    }

    public void delete(Long id){
        userMapper.delete(id);
    }
}
