package com.wl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller - 第一个controller
 *
 * @author WeiLin
 * @version 1.0
 */
@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello SpringBoot!";
    }
}
