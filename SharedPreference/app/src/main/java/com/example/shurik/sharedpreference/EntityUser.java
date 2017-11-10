package com.example.shurik.sharedpreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shurik on 06.11.2017.
 */

public class EntityUser {

    private int id = -1;
    private String name = "";
    private String description  = "";
    private TestEntity testEntity = new TestEntity();

    private List<String> stringList = new ArrayList<>();

    public EntityUser() {

        testEntity.setName("test Entity name 1");

        for (int i = 0; i++ < 10; ){
            stringList.add("String " + i);
        }

    }

    public EntityUser(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestEntity getTestEntity() {
        return testEntity;
    }

    public void setTestEntity(TestEntity testEntity) {
        this.testEntity = testEntity;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityUser that = (EntityUser) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "EntityUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", testEntity=" + testEntity +
                ", stringList=" + stringList +
                '}';
    }
}
