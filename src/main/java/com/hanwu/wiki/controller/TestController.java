package com.hanwu.wiki.controller;

import com.hanwu.wiki.domain.Test;
import com.hanwu.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private TestService testService;
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


    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.lsit();
    }


}














