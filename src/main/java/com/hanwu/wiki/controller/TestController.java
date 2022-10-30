package com.hanwu.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName TestController
 * @Description 测试使用
 * @Author hanWu
 * @Date 2022-10-30 8:53
 */
@RestController
public class TestController {


//    读取配置文件参数
    @Value("${test.hello:TEST}")
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "111" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello world ! post: " + name;
    }

    @GetMapping("/hello/{id}")
    public String getId(@PathVariable Integer id){
        return id + testHello;
    }


}














