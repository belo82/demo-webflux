package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/say-hello")
public class DemoController {

    @GetMapping(path = "")
    @ResponseBody
    String test() {
        return "Hello World";
    }
}
