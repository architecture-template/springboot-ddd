package com.api.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.app.response.ApiResponse;
import com.api.app.request.AddExample;
import com.api.domain.model.Example;
import com.api.domain.service.ExampleService;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    @Autowired
    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/{id}")
    public ApiResponse getExample(@PathVariable Long id) {
        Example example = exampleService.getExampleById(id);
        if (example == null) {
            return new ApiResponse(404, "Example not found", null);
        }

        return new ApiResponse(200, "Get Example", example);
    }

    @PostMapping("/add")
    public ApiResponse addExample(@RequestBody AddExample request) {
        Example example = exampleService.addExample(request);
        if (example == null) {
            return new ApiResponse(500, "Failed to add Example", null);
        }

        return new ApiResponse(200, "Add Example", example);
    }
}
