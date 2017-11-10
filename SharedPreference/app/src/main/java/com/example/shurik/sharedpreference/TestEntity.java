package com.example.shurik.sharedpreference;

/**
 * Created by shurik on 06.11.2017.
 */

public class TestEntity {

    private String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
