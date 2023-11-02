package com.api.app.controller;

import org.springframework.web.bind.annotation.*;

import com.api.app.response.ApiResponse;
import com.api.app.request.ExampleRequest;
import com.api.app.output.ExampleOutput; 
import com.api.domain.entity.Example;
import com.api.domain.service.ExampleService;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/{id}")
    public ApiResponse getExample(@PathVariable Long id) {
        Example example = exampleService.getExampleById(id);
        if (example == null) {
            return new ApiResponse(404, "Example not found", null);
        }

        ExampleOutput output = new ExampleOutput(example);

        return new ApiResponse(200, "Get Example", output);
    }

    @PostMapping("")
    public ApiResponse addExample(@RequestBody ExampleRequest request) {
        Example example = exampleService.addExample(request);
        if (example == null) {
            return new ApiResponse(500, "Failed to add Example", null);
        }

        ExampleOutput output = new ExampleOutput(example);

        return new ApiResponse(200, "Add Example", output);
    }

    @PutMapping("/{id}")
    public ApiResponse updateExample(@PathVariable Long id, @RequestBody ExampleRequest request) {
        Example existingExample = exampleService.getExampleById(id);
        if (existingExample == null) {
            return new ApiResponse(404, "Example not found", null);
        }

        Example updatedExample = exampleService.updateExample(id, request);
        if (updatedExample == null) {
            return new ApiResponse(500, "Failed to update Example", null);
        }

        ExampleOutput output = new ExampleOutput(updatedExample);

        return new ApiResponse(200, "Update Example", output);
    }

    @DeleteMapping("/{id}")
    public ApiResponse deleteExample(@PathVariable Long id) {
        Example example = exampleService.getExampleById(id);
        if (example == null) {
            return new ApiResponse(404, "Example not found", null);
        }

        exampleService.deleteExampleById(id);

        ExampleOutput output = new ExampleOutput(example);

        return new ApiResponse(200, "Delete Example", output);
    }
}
