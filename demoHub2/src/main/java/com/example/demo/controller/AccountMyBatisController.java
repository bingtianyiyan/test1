/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: AccountMyBatisController
 * Author:   ydy
 * Date:     2020/4/8 17:50
 * Description: MyBatis-Controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.entity.AccountMyBatis;
import com.example.demo.service.AccountMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈MyBatis-Controller〉
 *
 * @author ydy
 * @create 2020/4/8 17:50
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/AccountMyBatis")
public class AccountMyBatisController {
    @Autowired
    AccountMyBatisService accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountMyBatis> getAccounts() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountMyBatis getAccountById(@PathVariable("id") int id) {
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        int t= accountService.update(name,money,id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id")int id) {
        int t= accountService.delete(id);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {

        int t= accountService.add(name,money);
        if(t==1) {
            return "success";
        }else {
            return "fail";
        }

    }

}
