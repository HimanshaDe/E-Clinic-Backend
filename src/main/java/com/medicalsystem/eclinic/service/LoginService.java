package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.LoginRequestDTO;
import com.medicalsystem.eclinic.entity.Admin;
import com.medicalsystem.eclinic.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {


    private final AdminRepo adminRepo;

    @Autowired
    public LoginService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }


    public void validateLogin(final LoginRequestDTO loginRequest){
        Optional<Admin> loginOptional = adminRepo.findByAdminUserNameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if(!loginOptional.isPresent()){
            throw new RuntimeException("invalid login");
        }
    }
}
