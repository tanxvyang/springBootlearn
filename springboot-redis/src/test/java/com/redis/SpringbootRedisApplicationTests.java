package com.redis;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import sun.swing.plaf.synth.Paint9Painter;

@SpringBootTest
class SpringbootRedisApplicationTests {
@Autowired
private StringRedisTemplate stringRedisTemplate;
@Autowired
private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {

    }
    /** * 使用stringRedisTemplate * Redis数据类型：String、List、Set、ZSet、Hash */
    @Test
    public void test1(){
        // ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        // ListOperations<String, String> stringStringListOperations = stringRedisTemplate.opsForList();
        //
        //String
        // stringRedisTemplate.opsForValue().set("username","admin");
        // System.out.println(stringRedisTemplate.opsForValue().get("username"));
        //List
        stringRedisTemplate.opsForList().leftPush("names","tom");
        System.out.println(stringRedisTemplate.opsForList().range("names",0,-1));
    }


}
