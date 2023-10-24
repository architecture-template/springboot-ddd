package com.api.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.response.ApiResponse;

@RestController
public class ApiRouter {

    @GetMapping("/example")
    public ApiResponse helloWorld() {
        int status = 200;
        String message = "Get Example";
        return new ApiResponse(status, message, null);
    }
}
