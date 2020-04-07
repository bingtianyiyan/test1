/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: UserEntity
 * Author:   ydy
 * Date:     2020/4/7 9:43
 * Description: user表实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 〈一句话功能简述 
 * 〈user表实体〉
 *
 * @author ydy
 * @create 2020/4/7 9:43
 * @since 1.0.0
 */
@TableName(value = "users")//指定表名
public class UserEntity {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private  String userName;
    private String  passWord ;
    @TableField("user_sex")
    private String  userSex;
    @TableField("nick_name")
    private  String nickName;

    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public String getUser_sex() {
        return this.userSex;
    }

    public String getNick_name() {
        return this.nickName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String UserName) {
        this.userName = UserName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUser_sex(String user_sex) {
        this.userSex = user_sex;
    }

    public void setNick_name(String nick_name) {
        this.userName = nick_name;
    }

}
