package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleDispatcher {

    @RequestMapping("/dispatcher")
    public String dispatcher(@RequestParam("articleName") String articleName){
        return articleName + ".html";
    }
}
