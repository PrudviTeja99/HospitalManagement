package com.Mindtree.HospitalManagment;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.transaction.Transactional;

import com.Mindtree.HospitalManagment.controller.DoctorController;
import com.Mindtree.HospitalManagment.controller.PatientController;
import com.Mindtree.HospitalManagment.entity.Doctor;
import com.Mindtree.HospitalManagment.entity.Patient;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class HospitalManagmentApplicationTests 
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PatientController patientController;

    @Autowired
     DoctorController doctorController;


    @Test
    public void test(){
        assertTrue(true);
    }
    @Test
    public void  showPatientInformationTest(){
        Patient patient =patientController.showPatientInformation(1);
        assertEquals(patient.getName(),"Teja");
    }

    @Test
    public void showDoctorInformationTest(){
        Doctor doc = doctorController.getDoctorInfo("Prudviteja"); 
        assertEquals(doc.getField(),"Dentist");
    }

    @Test
    @DirtiesContext
    @Transactional
    public void saveDoctorInformation(){
        Doctor doc = new Doctor(3,"Ravi", 30, "male", "compounder");
        boolean res=doctorController.addUser(doc);
        assertTrue(res);
    }

    @Test
    @DirtiesContext
    @Transactional
    public void savePatientInformation(){
        Patient patient = new Patient(3, "Jessy", 31, "Raj",LocalDate.now(), "female", "Healthy Food");
        boolean res = patientController.createPatient(patient);
        assertTrue(res);
    }
}
