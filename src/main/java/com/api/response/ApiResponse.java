package com.api.response;

public class ApiResponse {

    private int status;
    private String message;
    private Object items;

    public ApiResponse(int status, String message, Object items) {
        this.status = status;
        this.message = message;
        this.items = items;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return items;
    }

    public void setData(Object items) {
        this.items = items;
    }
}
