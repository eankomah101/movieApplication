package com.eankomah.movieApp.service;

import com.eankomah.movieApp.dto.*;
import com.eankomah.movieApp.entity.User;

public interface AuthenticationService {
    SignUpResponse signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
