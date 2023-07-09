package com.platzidoctorcrud.web.controller;

import com.platzidoctorcrud.persistence.entity.PatientEntity;
import com.platzidoctorcrud.service.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @PostMapping("/add")
    ResponseEntity<PatientEntity> add(@RequestBody PatientEntity patient){
        System.out.println("hola"+patient.getIdPatient());
        return ResponseEntity.ok(this.patientService.save(patient));
    }
}
