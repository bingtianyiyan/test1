/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: getUserOneInput
 * Author:   ydy
 * Date:     2020/4/7 10:21
 * Description: 查询单个用户输入模型
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.domain.dto;

import javax.validation.constraints.NotNull;

/**
 * 〈一句话功能简述 
 * 〈查询单个用户输入模型〉
 *
 * @author ydy
 * @create 2020/4/7 10:21
 * @since 1.0.0
 */
public class getUserOneInput {
    @NotNull(message = "ID不能为空")
    private Long id ;

    public getUserOneInput() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
