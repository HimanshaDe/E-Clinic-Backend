package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.AdminDTO;
import com.medicalsystem.eclinic.entity.Admin;
import com.medicalsystem.eclinic.repository.AdminRepo;
import com.medicalsystem.eclinic.service.AdminSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceIMPL implements AdminSevice {

    @Autowired
    private AdminRepo adminRepo;


    @Override
    public String saveAdmin(AdminDTO adminDTO) {
        Admin admin = new Admin(adminDTO.getAdminID(),adminDTO.getAdminUserName(), adminDTO.getPassword());
    adminRepo.save(admin);

        return null;
    }

    @Override
    public AdminDTO getAdminById(int adminId) {

        if(adminRepo.existsById(adminId)){
            Admin admin =adminRepo.getReferenceById((adminId));
            AdminDTO adminDTO =new AdminDTO(
                   admin.getAdminID(),admin.getAdminUserName(),admin.getPassword()
            );return adminDTO;
        }else{
            throw new RuntimeException("No");
        }
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        List<Admin> getAllAdmins = adminRepo.findAll();

        List<AdminDTO> adminDTOList = new ArrayList<>();

        for (Admin admin : getAllAdmins){
            AdminDTO adminDTO =new AdminDTO(
                   admin.getAdminID(),admin.getAdminUserName(),admin.getPassword()
            );
            adminDTOList.add(adminDTO);
        }
        return adminDTOList;
    }




    public void login(String username, String password){
        Optional<Admin> optionalAdmin = adminRepo.findByAdminUserNameAndPassword(username, password);
        if(!optionalAdmin.isPresent()){
            throw new RuntimeException("Invalid Login");
        }
    }

}
