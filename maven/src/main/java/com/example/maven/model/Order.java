package com.example.maven.model;

public class Order {
    private String item;
    private Integer count;

    public Order() {}

    public Order(String item, Integer count) {
        this.item = item;
        this.count = count;
    }

    public String getItemname() {
        return item;
    }

    public void setItemname(String item) {
        this.item = item;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
