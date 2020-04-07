/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: MybatisPlusConfig
 * Author:   ydy
 * Date:     2020/4/7 13:41
 * Description: 分页
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述 
 * 〈分页〉
 *
 * @author ydy
 * @create 2020/4/7 13:41
 * @since 1.0.0
 */
@Configuration
public class MybatisPlusConfig {

    // 分页插件
    @Bean   // 注入Spring容器中
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}