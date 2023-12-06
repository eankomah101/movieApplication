package com.eankomah.movieApp.service;

import com.eankomah.movieApp.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;
import java.util.Map;

public interface JWTService {

    String extractUsername(String token);

    String generateToken(UserDetails userDetails) ;

    boolean isTokenValid(String token,UserDetails userDetails);

    String generateRefreshToken(Map<String,Object> extractClaims, UserDetails userDetails);
}
