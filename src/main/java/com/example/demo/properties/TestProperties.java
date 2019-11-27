package com.example.demo.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "student")
@Component
public class TestProperties {
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
