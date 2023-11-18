package com.medicalsystem.eclinic.service.impl;

import com.medicalsystem.eclinic.dto.DoctorDTO;
import com.medicalsystem.eclinic.dto.request.DoctorLoginDTO;
import com.medicalsystem.eclinic.dto.request.DoctorUpdateDTO;
import com.medicalsystem.eclinic.entity.Admin;
import com.medicalsystem.eclinic.entity.Doctor;
import com.medicalsystem.eclinic.repository.DoctorRepo;
import com.medicalsystem.eclinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceIMPL implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;


    @Override
    public List<DoctorDTO> getAllDoctors() {
        List<Doctor> getAllDoctors = doctorRepo.findAll();

        List<DoctorDTO> doctorDTOList = new ArrayList<>();

            for (Doctor doctor : getAllDoctors){
                    DoctorDTO doctorDTO =new DoctorDTO(
                            doctor.getDoctorId(),doctor.getDoctorName(),doctor.getBirthDate(),doctor.getNic(),
                            doctor.getContact(),doctor.getEmail(),doctor.getGender(),doctor.getImageName(),doctor.getSpeciality(),doctor.getQualifications(),doctor.getDoj(),doctor.getUsername(),doctor.getPassword(),
                            doctor.isActiveStatus()
                    );

                doctorDTOList.add(doctorDTO);
            }
        return doctorDTOList;
    }

    @Override
    public String saveDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor(
                doctorDTO.getDoctorId(),doctorDTO.getDoctorName(),doctorDTO.getBirthDate(),doctorDTO.getNic(),
                doctorDTO.getContact(),doctorDTO.getEmail(),doctorDTO.getQualifications(),doctorDTO.getGender(),doctorDTO.getImageName(),doctorDTO.getSpeciality(),doctorDTO.getDoj(),doctorDTO.getUsername(),doctorDTO.getPassword(),
                doctorDTO.isActiveStatus()
        );
        doctorRepo.save(doctor);
         return "save";

    }

    @Override
    public String updateDoctor(DoctorUpdateDTO doctorUpdateDTO) {
    if (doctorRepo.existsById(doctorUpdateDTO.getDoctorId())){
        Doctor doctor = doctorRepo.getReferenceById(doctorUpdateDTO.getDoctorId());
        doctor.setDoctorName(doctorUpdateDTO.getDoctorName());
        doctor.setNic(doctorUpdateDTO.getNic());
        doctor.setContact(doctorUpdateDTO.getContact());
        doctor.setEmail(doctorUpdateDTO.getEmail());
        doctor.setImageName(doctorUpdateDTO.getImageName());
        doctor.setUsername(doctorUpdateDTO.getUsername());
        doctor.setPassword(doctorUpdateDTO.getPassword());
        doctor.setActiveStatus(doctorUpdateDTO.isActiveStatus());

        doctorRepo.save(doctor);
        return doctorUpdateDTO.getDoctorName() +  " updated successfully!";

    }else {
        throw new RuntimeException("No data found!");
    }
    }

    @Override
    public DoctorDTO getDoctorById(int doctorId) {
        if(doctorRepo.existsById(doctorId)){
            Doctor doctor =doctorRepo.getReferenceById((doctorId));
            DoctorDTO doctorDTO =new DoctorDTO(
                    doctor.getDoctorId(),doctor.getDoctorName(),doctor.getBirthDate(),doctor.getNic(),
                    doctor.getContact(),doctor.getEmail(),doctor.getGender(),doctor.getImageName(),doctor.getSpeciality(),doctor.getQualifications(),doctor.getDoj(),doctor.getUsername(),doctor.getPassword(),
                    doctor.isActiveStatus()
            );
            return doctorDTO;
        }else{
            throw new RuntimeException("No");
        }

    }

    @Override
    public Doctor validateLogin(final DoctorLoginDTO doctorLoginDTO) {
        Optional<Doctor> loginOptional = doctorRepo.findByUsernameAndPassword(doctorLoginDTO.getUsername(), doctorLoginDTO.getPassword());
        if(!loginOptional.isPresent()){
            throw new RuntimeException("invalid login");
        }else{
           return loginOptional.get();
        }
    }


}
