package com.cybage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tukaramdh on 3/9/2017.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Life is beautiful BaBa!!!";
    }
}
