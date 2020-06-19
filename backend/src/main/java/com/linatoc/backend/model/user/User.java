package com.linatoc.backend.model.user;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //gives you all getters/setters
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class User {
    @Id
    private String id;
    // @Indexed(unique = true, direction = IndexDirection.DESCENDING, dropDups = true)
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    public String getFullName() {
        return firstName != null ? firstName.concat(" ").concat(lastName) : "";
    }
}