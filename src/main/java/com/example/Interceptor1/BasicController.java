package com.example.Interceptor1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
private APILoggingInterceptor apiInterceptor;


    @GetMapping()
    public LocalDateTime time() {
        return LocalDateTime.now();
    }
}
