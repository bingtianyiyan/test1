/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountJpaController
 * Author:   ydy
 * Date:     2020/4/8 15:46
 * Description: Jpa
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

//import com.example.demo.dao.IAccountRepository;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountJpaServiceImpl;
import com.example.demo.service.IAccountJpaService;
import com.example.demo.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈Jpa〉
 *
 * @author ydy
 * @create 2020/4/8 15:46
 * @since 1.0.0
 */
@RestController
public class AccountJpaController {
    @Autowired
    private AccountJpaServiceImpl _service;
//    @Autowired
//    IAccountRepository _accountRep;

    @RequestMapping(value = "/api/jpaPostAccount", method = RequestMethod.POST)
    public Result<String> postAccount(@RequestParam(value = "name") String name,
                                      @RequestParam(value = "money") double money) {
      //List<Account> list = _accountRep.findAll();
        Account account = new Account();
        account.setMoney(money);
        account.setName(name);
        String result = _service.postAccount(account);
        return  Result.ofSuccessMsg("success");
    }

}
