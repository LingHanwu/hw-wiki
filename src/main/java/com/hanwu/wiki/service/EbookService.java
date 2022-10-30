package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.Ebook;
import com.hanwu.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName EbookService
 * @Description 图书服务
 * @Author hanWu
 * @Date 2022-10-30 10:21
 */
@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }


}
