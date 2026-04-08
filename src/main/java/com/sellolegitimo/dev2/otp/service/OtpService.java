package com.sellolegitimo.dev2.otp.service;

import org.springframework.stereotype.Service;

import com.sellolegitimo.dev2.otp.repository.OtpRepository;

@Service
public class OtpService {

    private final OtpRepository repository;

    public OtpService(OtpRepository repository) {
        this.repository = repository;
    }

    public void generate(String cedula) {
        String otp = "000000"; // fijo para pruebas
        repository.save(cedula, otp);
    }

    public boolean validate(String cedula, String otp) {

        if (!repository.exists(cedula)) return false;

        return repository.find(cedula).equals(otp);
    }
}