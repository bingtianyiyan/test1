/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: IAccountDAO
 * Author:   ydy
 * Date:     2020/4/8 13:58
 * Description: 测试JdbcTemplate的模型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈测试JdbcTemplate的模型〉
 *
 * @author ydy
 * @create 2020/4/8 13:58
 * @since 1.0.0
 */
public interface IAccountDAO {
    int add(UserEntity account);

    int update(UserEntity account);

    int delete(Long id);

    UserEntity findAccountById(Long id);

    List<UserEntity> findAccountList();
}
