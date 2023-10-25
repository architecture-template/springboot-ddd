package com.api.domain.service;

import com.api.domain.repository.ExampleRepository;
import com.api.domain.model.Example;
import com.api.app.request.AddExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    // getExampleById IDから取得する
    public Example getExampleById(Long id) {
        return exampleRepository.findById(id).orElse(null);
    }

    // addExample 追加する
    public Example addExample(AddExample request) {
        Example example = new Example();
        example.setExampleName(request.getExampleName());
        example.setCreatedAt();
        example.setUpdatedAt();

        return exampleRepository.save(example);
    }
}
