package com.Mindtree.HospitalManagment.repository;

import com.Mindtree.HospitalManagment.entity.Patient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PatientRepository extends CrudRepository<Patient,Integer> {
    
}