/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: JdbcTemplatesController
 * Author:   ydy
 * Date:     2020/4/8 13:57
 * Description: JdbcTemplate访问数据库
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.IAccountService;
import com.example.demo.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述 
 * 〈JdbcTemplate访问数据库〉
 *
 * @author ydy
 * @create 2020/4/8 13:57
 * @since 1.0.0
 */
@RestController
@RequestMapping("/account")
public class JdbcTemplatesController {
    @Autowired
    IAccountService accountService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result<String> postAccount(@RequestParam(value = "userName")String userName,
                              @RequestParam(value = "passWord" )String passWord){
        UserEntity account=new UserEntity();
        account.setUserName(userName);
        account.setPassWord(passWord);
        int t= accountService.add(account);
        if(t==1){
            return  Result.ofSuccessMsg("success");
        }else {
            return  Result.ofFail(300,"fail");
        }

    }

}
