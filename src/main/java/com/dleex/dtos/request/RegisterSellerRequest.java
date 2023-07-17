package com.dleex.dtos.request;

import com.dleex.data.model.Role;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
@Data
public class RegisterSellerRequest {
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
