package com.sellolegitimo.dev2.otp.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class OtpRepository {

    private final Map<String, String> storage = new HashMap<>();

    public void save(String cedula, String otp) {
        storage.put(cedula, otp);
    }

    public String find(String cedula) {
        return storage.get(cedula);
    }

    public boolean exists(String cedula) {
        return storage.containsKey(cedula);
    }
}