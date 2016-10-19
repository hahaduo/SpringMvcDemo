package com.omg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lihongjun on 2016/10/19.
 */

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/hello")
    public String hello(){
        return "index";
    }
}

