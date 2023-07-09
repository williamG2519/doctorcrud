package com.platzidoctorcrud.persistence.repository;

import com.platzidoctorcrud.persistence.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface RepositoryPatient extends JpaRepository<PatientEntity,Long> {
}
