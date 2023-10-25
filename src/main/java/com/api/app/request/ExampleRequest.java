package com.api.app.request;

public class ExampleRequest {
    private String exampleName;

    public ExampleRequest() {
        // デフォルトコンストラクタ
    }

    public ExampleRequest(String exampleName) {
        this.exampleName = exampleName;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
