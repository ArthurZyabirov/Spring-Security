package com.example.Spring.Security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String wellDone() {
        return "Я авторизовался и вошел в сеть!";
    }

    @GetMapping("/hello**")
    public String helloFromWeb() {
        return "Ты знаешь правильную ссылку, молодец!";
    }
}
