package com.example.covr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
final class CovrController {

    @GetMapping("/")
    Iterable<?> getEmptyList(){
        return Collections.emptyList();
    }

    @GetMapping("/hello")
    String getHello(){
        return "Hey there!";
    }
}
