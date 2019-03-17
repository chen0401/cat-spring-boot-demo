package com.chen.cat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * Created by chen on 2018/11/13 15:36.
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello/v2")
    private String hello() {
        Jedis jedis = new Jedis("172.16.90.119",6379);
        jedis.auth("ws2017_123");
        String info = jedis.get("school_info_ligong");
        RestTemplate restTemplate = new RestTemplate();
        Object object = restTemplate.getForObject("http://172.16.90.114:12880/taskTimerCenter/queues",String.class);
        Object object2 = restTemplate.getForObject("http://localhost:8080/customers",String.class);
        return object.toString();
        //return "Hello World!";
    }
}
