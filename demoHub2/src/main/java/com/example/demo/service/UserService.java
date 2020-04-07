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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> getAll(){
        List<UserEntity> users = userMapper.getAll();
        System.out.println(users.toString());
        return  users;
    }
}
