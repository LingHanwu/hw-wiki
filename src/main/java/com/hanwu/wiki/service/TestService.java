package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.Test;
import com.hanwu.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestService
 * @Description 服务类测试
 * @Author hanWu
 * @Date 2022-10-30 10:21
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> lsit(){
        return testMapper.list();
    }


}
