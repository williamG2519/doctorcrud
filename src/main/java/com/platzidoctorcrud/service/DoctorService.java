package com.platzidoctorcrud.service;

import com.platzidoctorcrud.persistence.entity.DoctorEntity;
import com.platzidoctorcrud.persistence.repository.RepositoryDoctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final RepositoryDoctor repositoryDoctor;

    public DoctorService(RepositoryDoctor repositoryDoctor) {

        this.repositoryDoctor = repositoryDoctor;
    }
    public DoctorEntity add(DoctorEntity doctor){
        System.out.println("por a qui va"+ doctor);
        return this.repositoryDoctor.save(doctor);
    }
}
