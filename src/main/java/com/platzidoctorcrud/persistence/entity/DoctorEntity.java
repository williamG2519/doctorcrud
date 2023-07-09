package com.platzidoctorcrud.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor",nullable = false,unique = true)
    private Long idDoctor;
    @Column(length = 30,nullable = false)
    private String name;
    @Column(length = 30,nullable = false)
    private String email;
    @Column(name = "phone_number",length = 20)
    private String phoneNumber;
    private String speciality;
    @OneToOne
    @JoinColumn(name = "id_patient")
    private PatientEntity patientEntity;

}
