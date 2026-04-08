package com.sellolegitimo.dev2.otp.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellolegitimo.dev2.otp.dto.GenerateOtpRequest;
import com.sellolegitimo.dev2.otp.dto.OtpRequest;
import com.sellolegitimo.dev2.otp.service.OtpService;

@RestController
@RequestMapping("/api/v1/otp")
@CrossOrigin(origins = "*")
public class OtpController {

    private final OtpService otpService;

    public OtpController(OtpService otpService) {
        this.otpService = otpService;
    }

    @PostMapping("/generate")
    public Map<String, String> generate(@RequestBody GenerateOtpRequest request) {

        otpService.generate(request.cedula);

        return Map.of("message", "OTP generado");
    }

    @PostMapping("/validate")
    public Map<String, Boolean> validate(@RequestBody OtpRequest request) {

        boolean valid = otpService.validate(request.cedula, request.otp);

        return Map.of("valid", valid);
    }
}