package com.example.userservice.model;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory")
    private String firstName;

    private String lastName;

    @Min(value = 18, message = "Age must be over 18")
    private int age;

    @NotBlank(message = "Country is mandatory")
    private String country;

    @Email
    private String email;

    private String phone;

}