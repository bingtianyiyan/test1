/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: IAccountRepository
 * Author:   ydy
 * Date:     2020/4/8 15:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao;

import com.example.demo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述 
 * Jpa
 *
 * @author ydy
 * @create 2020/4/8 15:40
 * @since 1.0.0
 */
public interface IAccountRepository  extends JpaRepository<Account,Long> {
}
