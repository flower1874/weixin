package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : F
 * @项目名称 : ideaGitHub
 * @创建者 : flower
 * @date : 2024/11/6 下午6:53
 */
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String test(){
        return "hello world";
    }

}
