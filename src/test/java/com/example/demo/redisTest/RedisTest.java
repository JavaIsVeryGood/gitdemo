package com.example.demo.redisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    RedisTemplate<String,Object> redisTemplate;

    @Test
    public void test(){
        redisTemplate.opsForValue().set("a","111");
    }
}
