/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserController
 * Author:   ydy
 * Date:     2020/4/7 10:00
 * Description: 控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.domain.dto.getUserOneInput;
import com.example.demo.domain.vo.GreetingVo;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈控制器〉
 *
 * @author ydy
 * @create 2020/4/7 10:00
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService _userService;

    @RequestMapping(value = "/api/getUserAllList", method = RequestMethod.GET)
    @ResponseBody
    public Result<List<UserEntity>> getUserAllList(){
        List<UserEntity> list = _userService.getAll();
        return  Result.ofSuccess(list);
    }

    @RequestMapping(value = "/api/getUserOne",method = RequestMethod.GET)
    @ResponseBody
    public  Result<UserEntity> getOne(@ModelAttribute getUserOneInput input){
        System.out.println(input.getId());
        UserEntity entity = _userService.getOne(input.getId());
        return  Result.ofSuccess(entity);
    }

    @RequestMapping(value = "api/insertUser",method = RequestMethod.POST)
    @ResponseBody
    public  Result<String> insertUser(@RequestBody UserEntity input){
        _userService.insert(input);
        return Result.ofSuccess("成功");
    }

    @RequestMapping(value = "api/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public  Result<String> updateUser(@RequestBody  UserEntity input){
        _userService.update(input);
        return Result.ofSuccess("成功");
    }

    @RequestMapping(value = "api/deleteUser",method = RequestMethod.DELETE)
    @ResponseBody
    public  Result<String> deleteUser(@ModelAttribute getUserOneInput input){
        _userService.delete(input.getId());
        return Result.ofSuccess("成功");
    }
}
