package com.example.springbootredispracticedemo.redis;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

public class RedisTest {

    @Resource
    private RedisUtils redisUtils;

    /**
     * 插入緩存數據
     */
    @Test
    public void set(){
        redisUtils.set("redis_key", "redis_value");
    }

    /**
     * 讀取存數據
     */
    @Test
    public void get(){
        String value = redisUtils.get("redis_key");
        System.out.println(value);
    }

}



