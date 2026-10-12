package com.ecommerce.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    @NotBlank(message = "First name is Mandatory")
    @Size(min = 2, max = 40, message = "First name must be between 2 to 40 characters")
    private String firstName;

    @Size(max=50, message = "Lastname must not exceed 50 characters")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Please enter a valid Email address")
    @Size(max=70, message = "Email size must not exceed 70 characters")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 20,
            message = "Password must be between 8 and 20 characters")
    private String password;

    @NotBlank(message = "Mobile No is required")
    @Pattern(regexp = "^[6-9]\\d{9}$",
            message = "Mobile No must be valid and 10-digit long")
    private String phoneNumber;

}
