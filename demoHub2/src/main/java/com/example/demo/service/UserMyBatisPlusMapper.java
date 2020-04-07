/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserMyBatisPlusMapper
 * Author:   ydy
 * Date:     2020/4/7 11:52
 * Description: MyBatis-Plus应用访问层接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述 
 * 〈MyBatis-Plus应用访问层接口〉
 *
 * @author ydy
 * @create 2020/4/7 11:52
 * @since 1.0.0
 */
@Service
public interface UserMyBatisPlusMapper extends BaseMapper<UserEntity> {
}
