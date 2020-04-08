/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: IAccountMyBatisMapper
 * Author:   ydy
 * Date:     2020/4/8 17:43
 * Description: MyBatis-Mapper
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.dao;

import com.example.demo.entity.AccountMyBatis;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈一句话功能简述 
 * 〈MyBatis-Mapper〉
 *
 * @author ydy
 * @create 2020/4/8 17:43
 * @since 1.0.0
 */
@Mapper
public interface IAccountMyBatisMapper {
    @Insert("insert into accountMyBatis(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update accountMyBatis set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from accountMyBatis where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from accountMyBatis where id = #{id}")
    AccountMyBatis findAccount(@Param("id") int id);

    @Select("select id, name as name, money as money from accountMyBatis")
    List<AccountMyBatis> findAccountList();
}
