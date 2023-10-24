package com.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.response.ApiResponse;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public ApiResponse getExample() {
        return new ApiResponse(200, "Success Get Example", null);
    }
}
