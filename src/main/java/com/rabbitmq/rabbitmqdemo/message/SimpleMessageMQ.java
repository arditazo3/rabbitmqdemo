package com.rabbitmq.rabbitmqdemo.message;

import java.io.Serializable;

public class SimpleMessageMQ implements Serializable {

    private String name;
    private String description;

    public SimpleMessageMQ() {
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

    @Override
    public String toString() {
        return "SimpleMessageMQ{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
