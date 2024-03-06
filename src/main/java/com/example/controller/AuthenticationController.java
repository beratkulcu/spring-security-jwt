package com.example.controller;

import com.example.dto.UserDto;
import com.example.dto.UserRequest;
import com.example.dto.UserResponse;
import com.example.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService ;

    @PostMapping ("/save")
    public ResponseEntity<UserResponse>  save (@RequestBody UserDto userDto){
        return  ResponseEntity.ok(authenticationService.save(userDto));
    }
    @PostMapping("/auth")
    public ResponseEntity<UserResponse> auth(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(authenticationService.auth(userRequest));
    }
}
