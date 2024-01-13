package com.example.jwtauthapp.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private  String firstName;
    private  String lastName;
    private  String password;
    private  String email;
}
