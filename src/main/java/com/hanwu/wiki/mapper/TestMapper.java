package com.hanwu.wiki.mapper;

import com.hanwu.wiki.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName TestMapper
 * @Description
 * @Author hanWu
 * @Date 2022-10-30 10:13
 */
@Mapper
public interface TestMapper {
    public List<Test> list();
}
