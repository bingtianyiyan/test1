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


/**
 * 〈一句话功能简述 
 * 〈user表实体〉
 *
 * @author ydy
 * @create 2020/4/7 9:43
 * @since 1.0.0
 */
public class UserEntity {
    private Long id;
    private  String UserName;
    private String  passWord ;
    private String  user_sex;
    private  String nick_name;

    public Long getId() {
        return this.id;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public String getUser_sex() {
        return this.user_sex;
    }

    public String getNick_name() {
        return this.nick_name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

}
