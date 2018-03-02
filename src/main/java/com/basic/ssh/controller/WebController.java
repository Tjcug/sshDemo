package com.basic.ssh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * locate com.basic.ssh.controller
 * Created by mastertj on 2018/3/2.
 */
@Controller
public class WebController {
    @RequestMapping("/")
    public String index(){
        return "temp";
    }
}
