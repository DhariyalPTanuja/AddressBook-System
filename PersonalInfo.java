package com.addressbooksystem;

public class PersonalInfo {

    private String fName ;
    private String lName;
    private long phoneNumber;
    private String email;
    private String state,city;
    private int zipCode;


    public PersonalInfo(String fname, String lname, long  phoneNumber, String email,String city , String state, int zipCode){
        this.fName = fname;
        this.lName = lname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    public String getState() {
        return state;
    }


    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "Name=" + fName + lName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", Address="  + city + "," +  state + ", "+ zipCode +
                '}';
    }
}

