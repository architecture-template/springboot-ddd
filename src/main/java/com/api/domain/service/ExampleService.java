package com.api.domain.service;

import com.api.domain.repository.ExampleRepository;
import com.api.domain.model.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Example getExampleById(Long id) {
        return exampleRepository.findById(id).orElse(null);
    }
}
