package com.platzidoctorcrud.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient",nullable = false,unique = true)
    private Long idPatient;
    @Column(length = 30,nullable = false)
    private String name;
    @Column(length = 30,nullable = false)
    private String email;
    @Column(name = "phone_number",length = 30,nullable = false)
    private String phoneNumber;
    private String address;
}
