package com.aqhg.openplatform.demo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kain  <xianren@aiqinhaigou.com>
 * @date 2019/2/12
 */


@RestController
@RequestMapping(value = "/a", produces = "application/json;charset=UTF-8")
public class TestController {


    @GetMapping(value = "/test")
    public String getUserInfo() {
        return "wa";
    }

}
