package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.Ebook;
import com.hanwu.wiki.domain.EbookExample;
import com.hanwu.wiki.mapper.EbookMapper;
import lombok.val;
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

    public List<Ebook> list(String name){
//        固定写法
//        EbookExample ebookExample = new EbookExample();
//        EbookExample.Criteria criteria = ebookExample.createCriteria();
        val ebookExample = new EbookExample();
        val criteria = ebookExample.createCriteria();
//        模糊匹配
        criteria.andNameLike("%" + name + "%");
        return ebookMapper.selectByExample(ebookExample);
    }


}
