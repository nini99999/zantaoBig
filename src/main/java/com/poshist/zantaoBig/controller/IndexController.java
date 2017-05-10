package com.poshist.zantaoBig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by server on 17-5-9.
 */
@Controller("/")
public class IndexController {
    @RequestMapping("/")
    public String index() {
        System.out.println("hello world");

        return "/index";
    }
}
