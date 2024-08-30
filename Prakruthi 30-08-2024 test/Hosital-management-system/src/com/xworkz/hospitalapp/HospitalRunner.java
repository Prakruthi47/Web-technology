package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.VaidheiHospital;

public class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        //encapsulation
        hospital.setPatientId(1);
        hospital.setPatientName("Anu");
        hospital.setAddress("bangalore");
        hospital.setPhoneNum(7598412658L);

        System.out.println("patient id : "+hospital.getPatientId());
        System.out.println("patient name :"+hospital.getPatientName());
        System.out.println("patient phone number : "+hospital.getPhoneNum());
        System.out.println("patient address : "+hospital.getAddress());

        //inhetitance
        VaidheiHospital vaidheiHospital = new VaidheiHospital();
        vaidheiHospital.setPatientId(5);
        System.out.println("patient id : "+vaidheiHospital.getPatientId());

        //runtime polymorphism
        Hospital hospital1 = new VaidheiHospital();
        hospital1.admission();



    }
}
