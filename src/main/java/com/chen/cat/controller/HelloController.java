package com.chen.cat.controller;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2018/11/13 15:36.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    private String hello() {
        /*Transaction t = Cat.newTransaction("URL", "Hello");
        try {
            Cat.logEvent("URL.Server", "/hello");
            t.setStatus(Transaction.SUCCESS);
        } catch (Exception e) {
            t.setStatus(Transaction.SUCCESS);
        } finally {
            t.complete();
        }*/
        return "Hello World!";
    }
}
