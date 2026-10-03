package com.example.BookMyShowBe.dto;

import jakarta.validation.constraints.*;

public record CreateProfileRequest(
        @NotBlank @Size(max = 100) String name,
        @NotBlank  @Email  @Size(max = 100) String email,
        @NotBlank @Pattern(regexp = "^[0-9+ ()-]{10,20}$") String phone

) {



}
