package com.api.app.request;

public class AddExample {
    private String exampleName;

    public AddExample() {
        // デフォルトコンストラクタ
    }

    public AddExample(String exampleName) {
        this.exampleName = exampleName;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
