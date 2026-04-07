package com.example.maven.model;

public class Order {
    private String item;
    private Integer count;

    public Order() {}

    public Order(String item, String count) {
        this.item = item;
        this.count = count;
    }

    public String getItemname() {
        return item;
    }

    public void setItemname(String item) {
        this.item = item;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
