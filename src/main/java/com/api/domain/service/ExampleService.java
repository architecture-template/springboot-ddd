package com.api.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.domain.repository.ExampleRepository;
import com.api.domain.entity.Example;

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
    public Example addExample(Example example) {
        return exampleRepository.save(example);
    }

    // updateExample IDに基づいてExampleを更新する
    public Example updateExample(Example example) {
        Example existingExample = exampleRepository.findById(example.getId()).orElse(null);
        if (existingExample == null) {            
            return null;
        }

        existingExample.setExampleName(example.getExampleName());
        existingExample.setUpdatedAt();

        return exampleRepository.save(existingExample);
    }

    // deleteExampleById IDから削除する
    public void deleteExampleById(Long id) {
        exampleRepository.deleteById(id);
    }
}
