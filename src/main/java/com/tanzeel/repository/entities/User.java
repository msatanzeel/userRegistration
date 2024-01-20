package com.tanzeel.repository.entities;

import lombok.*;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
