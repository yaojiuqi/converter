package com.yjq.converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {
    @GetMapping("/hello")
    public void hello(Date birthday){
        System.out.println(birthday);
    }
}
