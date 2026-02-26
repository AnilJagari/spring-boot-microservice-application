//package com.anil.apigateway.controller;
//
//import com.anil.apigateway.security.JwtUtil;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//@RequiredArgsConstructor
//public class AuthController {
//
//    private final JwtUtil jwtUtil;
//
//    // Simple login (no DB for now)
//    @PostMapping("/login")
//    public String login(@RequestParam String username,
//                        @RequestParam String password) {
//
//        // Hardcoded user check (for learning)
//        if ("anil".equals(username) && "1234".equals(password)) {
//            return jwtUtil.generateToken(username);
//        } else {
//            throw new RuntimeException("Invalid credentials");
//        }
//    }
//}
