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
        Example example = new Example();
        example.setExampleName(request.getExampleName());
        example.setCreatedAt();
        example.setUpdatedAt();

        Example result = exampleService.addExample(example);
        if (result == null) {
            return new ApiResponse(500, "Failed to add Example", null);
        }

        ExampleOutput output = new ExampleOutput(example);

        return new ApiResponse(200, "Add Example", output);
    }

    @PutMapping("/{id}")
    public ApiResponse updateExample(@PathVariable Long id, @RequestBody ExampleRequest request) {
        Example example = new Example();
        example.setId(id);
        example.setExampleName(request.getExampleName());

        Example result = exampleService.updateExample(example);
        if (result == null) {
            return new ApiResponse(500, "Failed to update Example", null);
        }

        ExampleOutput output = new ExampleOutput(result);

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
