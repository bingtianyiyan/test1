/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: GreetingVo
 * Author:   ydy
 * Date:     2020/4/3 16:38
 * Description: 展示层展示模型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.domain.vo;

/**
 * 〈一句话功能简述 
 * 〈展示层展示模型〉
 *
 * @author ydy
 * @create 2020/4/3 16:38
 * @since 1.0.0
 */
public class GreetingVo {

    private final long id;
    private final String content;

    public GreetingVo(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}