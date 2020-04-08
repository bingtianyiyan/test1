/**
 * Copyright (C), 2002-2020, 浙江天地人科技有限公司
 * FileName: HelloWorldController
 * Author:   ydy
 * Date:     2020/4/3 14:38
 * Description: 控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.example.demo.controller;

import com.example.demo.domain.vo.GreetingVo;
import com.example.demo.tools.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 〈一句话功能简述 
 * 〈控制器〉
 *
 * @author ydy
 * @create 2020/4/3 14:38
 * @since 1.0.0
 */
@RestController
public class HelloWorldController {

    private  static  final String template = "Hello world!";
    private  final AtomicLong counter = new AtomicLong();
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @Value(value = "${myConstant.data}")
    private String myData;

    @GetMapping("/greeting")
    public Result<GreetingVo> greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        LOG.info(myData);
        LOG.info("Log");
        return  Result.ofSuccess(new GreetingVo(counter.incrementAndGet(), String.format(template,name)));
    }
}
