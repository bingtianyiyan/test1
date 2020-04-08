/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: IAccountService
 * Author:   ydy
 * Date:     2020/4/8 14:06
 * Description: JdbcTemplate-Demo-Service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈JdbcTemplate-Demo-Service〉
 *
 * @author ydy
 * @create 2020/4/8 14:06
 * @since 1.0.0
 */
public interface IAccountService {
    int add(UserEntity account);

    int update(UserEntity account);

    int delete(Long id);

    UserEntity findAccountById(Long id);

    List<UserEntity> findAccountList();
}
