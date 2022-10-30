package com.hanwu.wiki.controller;

import com.hanwu.wiki.domain.Demo;
import com.hanwu.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/demo")
public class DemoController {

    @Resource
    DemoService demoService;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }


}














