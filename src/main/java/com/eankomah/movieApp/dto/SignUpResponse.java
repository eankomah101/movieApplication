package com.eankomah.movieApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpResponse {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
}
