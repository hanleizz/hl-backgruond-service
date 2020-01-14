package me.hanlei.test.dao;

import me.hanlei.test.po.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    public Test getTest();

}
