package com.api.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.app.response.ApiResponse;
import com.api.domain.model.Example;
import com.api.domain.service.ExampleService;

@Controller
@RestController
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/example/{id}")
    public ApiResponse getExample(@PathVariable Long id) {
        Example example = exampleService.getExampleById(id);
        if (example == null) {
            return new ApiResponse(404, "Example not found", null);
        }

        return new ApiResponse(200, "Success Get Example", example);
    }
}
