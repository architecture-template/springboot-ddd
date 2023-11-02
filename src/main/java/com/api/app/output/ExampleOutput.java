package com.api.app.output;

import com.api.domain.entity.Example;

public class ExampleOutput {
    private Long id;
    private String exampleName;

    public ExampleOutput() {
        // デフォルトコンストラクター
    }

    public ExampleOutput(Example example) {
        if (example != null) {
            this.id = example.getId();
            this.exampleName = example.getExampleName();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
