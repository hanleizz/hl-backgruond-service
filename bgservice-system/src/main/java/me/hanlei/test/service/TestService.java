package me.hanlei.test.service;

import me.hanlei.test.dao.TestMapper;
import me.hanlei.test.po.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    public TestMapper testMapper;

    public Test getTest(){
        return testMapper.getTest();
    }
}
