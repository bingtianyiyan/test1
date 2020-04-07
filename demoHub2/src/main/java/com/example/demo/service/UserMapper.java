/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserMapper
 * Author:   ydy
 * Date:     2020/4/7 9:39
 * Description: UserMapper
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserSexEnum;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈UserMapper〉
 *
 * @author ydy
 * @create 2020/4/7 9:39
 * @since 1.0.0
 */
public interface UserMapper {


    @Select("SELECT * FROM users")
//    @Results({
//            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//            @Result(property = "nickName", column = "nick_name")
//    })
    List<UserEntity> getAll();
}
