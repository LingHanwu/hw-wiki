package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.EbookExample;
import com.hanwu.wiki.mapper.EbookMapper;
import com.hanwu.wiki.req.EbookReq;
import com.hanwu.wiki.resp.EbookResp;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<EbookResp> list(EbookReq req){
//        固定写法
//        EbookExample ebookExample = new EbookExample();
//        EbookExample.Criteria criteria = ebookExample.createCriteria();
        val ebookExample = new EbookExample();
        val criteria = ebookExample.createCriteria();
//        模糊匹配
        criteria.andNameLike("%" + req.getName() + "%");
//        查询结果
        val ebookList = ebookMapper.selectByExample(ebookExample);

        val respList = new ArrayList<EbookResp>();

//        for (Ebook ebook:ebookList) {
//            val ebookResp = new EbookResp();
////            复制对象
//            BeanUtils.copyProperties(ebook, ebookResp);
//            respList.add(ebookResp);
//        }
        ebookList.forEach(ebook->{
            val ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        });

        return respList;
//        ebookList.forEach(ebook -> System.out.println(ebook));


    }


}
