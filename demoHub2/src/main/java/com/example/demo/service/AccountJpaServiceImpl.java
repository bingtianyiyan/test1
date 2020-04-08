/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountJpaService
 * Author:   ydy
 * Date:     2020/4/8 15:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.dao.IAccountRepository;
import com.example.demo.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述 
 *  Jpa实现Service
 *
 * @author ydy
 * @create 2020/4/8 15:42
 * @since 1.0.0
 */
@Service
public class AccountJpaServiceImpl //implements IAccountJpaService
{
    @Autowired
    IAccountRepository accountDao;

    public String postAccount(Account account) {
        Account account1 = accountDao.save(account);
        return account1.toString();

    }

}
