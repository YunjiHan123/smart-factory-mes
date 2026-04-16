package com.smartfactory.mes.auth.controller;

import com.smartfactory.mes.auth.dto.AuthRequestModels;
import com.smartfactory.mes.auth.dto.AuthResponseModels;
import com.smartfactory.mes.auth.service.AuthService;
import com.smartfactory.mes.global.api.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Auth", description = "Authentication APIs")
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @Operation(summary = "Sign up", description = "Create a user account and return an authenticated session.")
    @PostMapping("/signup")
    public ApiResponse<AuthResponseModels.AuthSessionResponse> signUp(
            @RequestBody AuthRequestModels.SignUpRequest request
    ) {
        return ApiResponse.success("Sign up completed.", authService.signUp(request));
    }

    @Operation(summary = "Log in", description = "Authenticate with email and password.")
    @PostMapping("/login")
    public ApiResponse<AuthResponseModels.AuthSessionResponse> login(
            @RequestBody AuthRequestModels.LoginRequest request
    ) {
        return ApiResponse.success("Login completed.", authService.login(request));
    }
}
