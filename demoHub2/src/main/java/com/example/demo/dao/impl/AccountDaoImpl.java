/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountDaoImpl
 * Author:   ydy
 * Date:     2020/4/8 14:01
 * Description: 实现接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao.impl;

import com.example.demo.dao.IAccountDAO;
import com.example.demo.entity.UserEntity;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述 
 * JdbcTemplate
 *
 * @author ydy
 * @create 2020/4/8 14:01
 * @since 1.0.0
 */
@Repository
public class AccountDaoImpl implements IAccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(UserEntity account) {
        return  jdbcTemplate.update("insert into users(userName,passWord) values(?,?)",account.getUserName(),account.getPassWord());
    }

    @Override
    public int update(UserEntity account) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public UserEntity findAccountById(Long id) {
        return null;
    }

    @Override
    public List<UserEntity> findAccountList() {
        return null;
    }
}
