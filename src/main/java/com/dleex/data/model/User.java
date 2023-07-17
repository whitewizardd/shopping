package com.dleex.data.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("User")
@Data
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    @CreatedDate
    private LocalDateTime dateRegistered;
    private Role userRole;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
