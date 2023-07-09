package com.platzidoctorcrud.web.controller;

import com.platzidoctorcrud.persistence.entity.DoctorEntity;
import com.platzidoctorcrud.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
    @PostMapping("/agregar")
    public ResponseEntity<DoctorEntity> add(@RequestBody DoctorEntity doctor){
        System.out.println("bye"+doctor.getPatientEntity().getName());
        return ResponseEntity.ok(this.doctorService.add(doctor));
    }
}
