package com.medicalsystem.eclinic.service;

import com.medicalsystem.eclinic.dto.AdminDTO;

import java.util.List;

public interface AdminSevice {
    public  String saveAdmin(AdminDTO adminDTO);

    AdminDTO getAdminById(int adminId);

    List<AdminDTO> getAllAdmins();

}
