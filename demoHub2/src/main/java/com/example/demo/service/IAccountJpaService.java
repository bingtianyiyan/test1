/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: IAccountJpaService
 * Author:   ydy
 * Date:     2020/4/8 15:45
 * Description: jpa-IService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.example.demo.entity.Account;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述 
 * 〈jpa-IService〉
 *
 * @author ydy
 * @create 2020/4/8 15:45
 * @since 1.0.0
 */
@Service
public interface IAccountJpaService {

   String postAccount(Account account);
}
