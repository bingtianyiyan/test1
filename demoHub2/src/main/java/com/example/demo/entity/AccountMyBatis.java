/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: accountMyBatis
 * Author:   ydy
 * Date:     2020/4/8 17:42
 * Description: Mybatis-Model
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.entity;

import javax.persistence.Table;

/**
 * 〈一句话功能简述 
 * 〈Mybatis-Model〉
 *
 * @author ydy
 * @create 2020/4/8 17:42
 * @since 1.0.0
 */
@Table(name = "accountMyBatis")
public class AccountMyBatis {
    private int id ;
    private String name ;
    private double money;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
