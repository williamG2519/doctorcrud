package com.platzidoctorcrud.persistence.repository;

import com.platzidoctorcrud.persistence.entity.DoctorEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface RepositoryDoctor extends ListCrudRepository<DoctorEntity,Long> {
}
