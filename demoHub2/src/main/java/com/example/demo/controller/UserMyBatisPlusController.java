/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserMyBatisPlusController
 * Author:   ydy
 * Date:     2020/4/7 11:54
 * Description: MyBatis-Plus
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.dto.getUserOneInput;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserMyBatisPlusMapper;
import com.example.demo.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈MyBatis-Plus〉
 *
 * @author ydy
 * @create 2020/4/7 11:54
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class UserMyBatisPlusController {
    @Autowired
    UserMyBatisPlusMapper _userService;


    @RequestMapping(value = "/api/MyBatisPlus/getUserAllList", method = RequestMethod.GET)
    @ResponseBody
    public Result<List<UserEntity>> getUserAllList(){
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper();
        // 参数1：数据库中的字段名  参数2：字段名的值（匹配的值）
        // 解读：把数据库中uid字段为1015和1016的值修改成user中的内容
        queryWrapper.eq("id",1);
        queryWrapper.or();    // 在查询中拼接or
        queryWrapper.eq("id",1016);
        List<UserEntity> list = _userService.selectList(queryWrapper);
        return  Result.ofSuccess(list);
    }

    @RequestMapping(value = "/api/MyBatisPlus/getUserPageList", method = RequestMethod.GET)
    @ResponseBody
    public Result<IPage<UserEntity>> getUserPageList(){
// 1.查询条件,null则为查询所有
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("userName","第五人格");
        // 1.1 使用其构造，参数1：当前页，参数2：每页的大小
        Page<UserEntity> page = new Page<>(1,2);
        // 2.执行查询
        // 参数1：为接口Ipage，其实现类只有一个Page，参数2：为查询条件，返回一个Ipage对象
        IPage<UserEntity> userIPage = _userService.selectPage(page, wrapper);
        // 3.打印重要参数
        System.out.println("总页数= " + userIPage.getPages());
        System.out.println("总记录数= " + userIPage.getTotal());
        System.out.println("页面大小= " + userIPage.getSize());
        System.out.println("当前页= " + userIPage.getCurrent());
        System.out.println("查询结果如下：" );
        return  Result.ofSuccess(userIPage);
    }

    @RequestMapping(value = "/api/MyBatisPlus/getUserOne",method = RequestMethod.GET)
    @ResponseBody
    public  Result<UserEntity> getOne(@ModelAttribute getUserOneInput input){
        System.out.println(input.getId());
        UserEntity entity = _userService.selectById(input.getId());
        return  Result.ofSuccess(entity);
    }

    @RequestMapping(value = "api/MyBatisPlus/insertUser",method = RequestMethod.POST)
    @ResponseBody
    public  Result<String> insertUser(@RequestBody UserEntity input){
        _userService.insert(input);
        return Result.ofSuccess("成功");
    }

    @RequestMapping(value = "api/MyBatisPlus/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public  Result<String> updateUser(@RequestBody  UserEntity input){
       // _userService.updateById(input);
        UpdateWrapper<UserEntity> wrapper = new UpdateWrapper<>();
        // 2.设置参数
        // set(String column, Object val)，参数1：数据库中的字段名  参数2：修改后的值
        // eq(String column, Object val),参数1：数据库中的字段名  参数2：修改条件
        // or(),使查询条件变成用or拼接
        wrapper.set("userName","第五人格");
        _userService.update(null,wrapper);
               // .eq("uid",1018).or().eq("uid",1019);
        return Result.ofSuccess("成功");
    }

    @RequestMapping(value = "api/MyBatisPlus/deleteUser",method = RequestMethod.DELETE)
    @ResponseBody
    public  Result<String> deleteUser(@ModelAttribute getUserOneInput input){
        _userService.deleteById(input.getId());
        return Result.ofSuccess("成功");
    }

    @RequestMapping(value = "api/MyBatisPlus/deleteBatchUser",method = RequestMethod.DELETE)
    @ResponseBody
    public  Result<String> deleteBatchUser(@ModelAttribute getUserOneInput input){
        // 根据集合进行删除（使用的是SQL中的in关键字）
        // 1.构建一个存放id列表的集合
        List<Integer> idList = new ArrayList<>();
        // 2.存放要进行删除的id，存放了3个id
        idList.add(1021);
        idList.add(1022);
        idList.add(1023);
        _userService.deleteBatchIds(idList);
        return Result.ofSuccess("成功");
    }
}
