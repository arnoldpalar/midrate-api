package com.mexchange.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    String id;

    private Map<String, Object> details;
    private List<Recipient> recipients;

    @NoArgsConstructor
    @Getter
    @Setter
    public static class Recipient{
        String fullName;
        String country;
        String bank;
        String accountNumber;
    }
}