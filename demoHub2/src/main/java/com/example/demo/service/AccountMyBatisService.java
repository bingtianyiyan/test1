/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountMyBatisService
 * Author:   ydy
 * Date:     2020/4/8 17:48
 * Description: MyBatis-Service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.dao.IAccountMyBatisMapper;
import com.example.demo.entity.AccountMyBatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈MyBatis-Service〉
 *
 * @author ydy
 * @create 2020/4/8 17:48
 * @since 1.0.0
 */
@Service
public class AccountMyBatisService {
    @Autowired
    @Lazy
    private IAccountMyBatisMapper accountMapper;

    public int add(String name, double money) {
        return accountMapper.add(name, money);
    }
    public int update(String name, double money, int id) {
        return accountMapper.update(name, money, id);
    }
    public int delete(int id) {
        return accountMapper.delete(id);
    }
    public AccountMyBatis findAccount(int id) {
        return accountMapper.findAccount(id);
    }
    public List<AccountMyBatis> findAccountList() {
        return accountMapper.findAccountList();
    }
}
