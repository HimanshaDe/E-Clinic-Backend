package com.medicalsystem.eclinic.controller;
import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.request.DoctorUpdateDTO;
import com.medicalsystem.eclinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/doctor")
@CrossOrigin
public class DoctorController {

    private final DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/doctor_save")
    public String saveDoctor(@RequestBody DoctorDTO doctorDTO ){
       String message = doctorService.saveDoctor(doctorDTO);
        return message;

    }
    @PutMapping("/doctor_update")
    private String updateDoctor(@RequestBody DoctorUpdateDTO doctorUpdateDTO){
        String message = doctorService.updateDoctor(doctorUpdateDTO);
        return message;

    }
    @GetMapping(
            path = "/get-by-id/{id}"
    )
    public DoctorDTO getDDoctorById(@PathVariable(value = "id") int doctor_id){
        DoctorDTO doctorDTO = doctorService.getDoctorById(doctor_id);

    return  doctorDTO;

    }
    @GetMapping(path = "/get-all-Doctors")
    public List<DoctorDTO> getAllDoctors(){
        List<DoctorDTO> allDoctors = doctorService.getAllDoctors();
        return allDoctors;
    }



}
