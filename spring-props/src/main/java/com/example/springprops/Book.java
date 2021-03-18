package com.example.springprops;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String name;
    private String author;
    private String price;
    private String description;
    private List<String> fans;
    private Map<String, Integer>rank;
}
