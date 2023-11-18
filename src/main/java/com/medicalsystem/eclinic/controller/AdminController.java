package com.medicalsystem.eclinic.controller;

import com.medicalsystem.eclinic.dto.AdminDTO;
import com.medicalsystem.eclinic.service.AdminSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Admin")
@CrossOrigin
public class AdminController{
    @Autowired
    private AdminSevice adminSevice;

    @PostMapping("/admin_save")
    public String saveAdmin(@RequestBody AdminDTO adminDTO ){
        System.out.println(adminDTO.getAdminUserName());
        String message = adminSevice.saveAdmin(adminDTO);
        return message;

    }

    @GetMapping(
            path = "/get-admin-by-id",
            params = "id"

    )
    public AdminDTO getAdminById(@RequestParam(value = "id") int adminID){

        AdminDTO adminDTO = adminSevice.getAdminById(adminID);

        return  adminDTO;

    }
    @GetMapping(path = "/get-all-Admins")
    public List<AdminDTO> getAllAdmins(){
        List<AdminDTO> allAdmins = adminSevice.getAllAdmins();
        return allAdmins;
    }
}
