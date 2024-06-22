package com.jalaldev.booksocial.booksocial.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty (message = "First name is requied")
    @NotBlank(message = "First name is required")
    private String firstname;
    @NotEmpty (message = "last name name is requied")
    @NotBlank(message = "last name is required")
    private String lastname;
    @NotEmpty (message = "First name is requied")
    @NotBlank(message = "First name is required")
    @Email(message = "Email is invalid")
    private String email;

    @NotEmpty (message = "First name is requied")
    @NotBlank(message = "First name is required")
    @Size(min=8,message = "Password should be 8 charcaters long minimum")
    private String password;

}
