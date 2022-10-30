package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.Demo;
import com.hanwu.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoService
 * @Description 服务类测试
 * @Author hanWu
 * @Date 2022-10-30 10:21
 */
@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }


}
