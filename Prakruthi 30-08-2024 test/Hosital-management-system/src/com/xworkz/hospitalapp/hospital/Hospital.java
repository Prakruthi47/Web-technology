package com.xworkz.hospitalapp.hospital;

public class Hospital {

  private   int patientId;
  private String patientName;
  private   long phoneNum;
  private   String address;

  public Hospital(){
      System.out.println(" default constructor");
  }


    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void admission(){
        System.out.println("patient is admitted to hospital");
    }


}
