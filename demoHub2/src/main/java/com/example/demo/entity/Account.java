/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: Account
 * Author:   ydy
 * Date:     2020/4/8 15:37
 * Description: Jpa-demo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 〈一句话功能简述 
 * 〈Jpa-demo〉
 *
 * @author ydy
 * @create 2020/4/8 15:37
 * @since 1.0.0
 */
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
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
