/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountService
 * Author:   ydy
 * Date:     2020/4/8 14:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.dao.IAccountDAO;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resources;
import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈〉
 *
 * @author ydy
 * @create 2020/4/8 14:07
 * @since 1.0.0
 */
@Service
public class AccountService implements IAccountService{
    @Autowired
    IAccountDAO accountDAO;

    @Override
    public int add(UserEntity account) {
        return accountDAO.add(account);
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
