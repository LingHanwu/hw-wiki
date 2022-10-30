package com.hanwu.wiki.controller;

import com.hanwu.wiki.req.EbookReq;
import com.hanwu.wiki.resp.CommonResp;
import com.hanwu.wiki.resp.EbookResp;
import com.hanwu.wiki.service.EbookService;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description 图书接口
 * @Author hanWu
 * @Date 2022-10-30 8:53
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    EbookService ebookService;

    @GetMapping("/list")
    public CommonResp<List<EbookResp>> list(EbookReq ebookReq){
        val resp = new CommonResp<List<EbookResp>>();
        val list = ebookService.list(ebookReq);

        resp.setContent(list);
        return resp;
    }


}














