package com.apedad.example.service;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.rules.Stopwatch;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StopWatch;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PostUserServiceTest {
    private static final Logger LOG = Logger.getLogger(PostUserServiceTest.class);
    @Autowired
    private PostUserService postUserService;

    @Test
    public void postUserlistAll() {
        System.out.println(postUserService.list().size());
    }

    @Test
    public void insert() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        postUserService.insert(10000);
        stopWatch.stop();
        System.out.println("spend time >> " + stopWatch.getTotalTimeMillis());
    }

    @Test
    public void update() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        postUserService.update(10000);
        stopWatch.stop();
        System.out.println("spend time >> " + stopWatch.getTotalTimeMillis());
    }
}
