package com.hanwu.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 测试使用
 * @Author hanWu
 * @Date 2022-10-30 8:53
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "111";
    }


}
