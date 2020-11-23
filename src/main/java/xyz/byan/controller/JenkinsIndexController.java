package xyz.byan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bai
 * @Description
 * @Date 2020/11/23 1:46 PM
 */
@RestController
public class JenkinsIndexController {

    @GetMapping("/index")
    public String index(){
        return "Hello Jenkins";
    }
}
