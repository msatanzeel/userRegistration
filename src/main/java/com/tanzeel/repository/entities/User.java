package com.tanzeel.repository.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
@Table(name = "user_details")
public class User {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Id
    private String email;
    @Column(name = "password")
    private String password;
}
