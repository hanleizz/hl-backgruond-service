package me.hanlei.test.rest;

import me.hanlei.test.po.Test;
import me.hanlei.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/getTest")
    public Test getTest(){
        return testService.getTest();
    }

}
