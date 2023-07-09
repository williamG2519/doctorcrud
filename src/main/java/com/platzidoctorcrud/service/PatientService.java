package com.platzidoctorcrud.service;

import com.platzidoctorcrud.persistence.entity.PatientEntity;
import com.platzidoctorcrud.persistence.repository.RepositoryPatient;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final RepositoryPatient repositoryPatient;

    public PatientService(RepositoryPatient repositoryPatient) {
        this.repositoryPatient = repositoryPatient;
    }
    public PatientEntity save(PatientEntity patient){
        return this.repositoryPatient.save(patient);
    }

}
