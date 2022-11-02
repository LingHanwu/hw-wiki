package com.hanwu.wiki.service;

import com.hanwu.wiki.domain.EbookExample;
import com.hanwu.wiki.mapper.EbookMapper;
import com.hanwu.wiki.req.EbookReq;
import com.hanwu.wiki.resp.EbookResp;
import com.hanwu.wiki.utils.CopyUtil;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

    public List<EbookResp> list(EbookReq req){
//        固定写法
//        EbookExample ebookExample = new EbookExample();
//        EbookExample.Criteria criteria = ebookExample.createCriteria();
        val ebookExample = new EbookExample();
        val criteria = ebookExample.createCriteria();

//        动态sql,如果参数不为空,则添加模糊查询条件
        if(!ObjectUtils.isEmpty(req.getName())){
//        模糊匹配
            criteria.andNameLike("%" + req.getName() + "%");
        }


//        查询结果
        val ebookList = ebookMapper.selectByExample(ebookExample);
//        val respList = new ArrayList<EbookResp>();
//        for (Ebook ebook:ebookList) {
//            val ebookResp = new EbookResp();
////            复制对象
//            BeanUtils.copyProperties(ebook, ebookResp);
//            respList.add(ebookResp);
//        }
//        ebookList.forEach(ebook->{
//            val ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//            respList.add(ebookResp);
//        });

        return CopyUtil.copyList(ebookList, EbookResp.class);
    }


}
