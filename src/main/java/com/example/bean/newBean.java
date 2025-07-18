package com.example.bean;

public class newBean {
    public String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Bean{" +
                "message='" + message + '\'' +
                '}';
    }
}
