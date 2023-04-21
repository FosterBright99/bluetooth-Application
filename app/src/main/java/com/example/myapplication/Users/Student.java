package com.example.myapplication.Users;

public class Student {
    private String name;
    private String email;
    private String phoneNumber;
    private String residence;
    private String age;
    private String studentID;
    private Integer yearOfStudy;
    private Integer yearOfAdmission;
    private Integer yearOfBirth;

    public Student(String name, String email, String phoneNumber, String residence, String age, String studentID, Integer yearOfStudy, Integer yearOfAdmission, Integer yearOfBirth) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.residence = residence;
        this.age = age;
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfBirth = yearOfBirth;
    }

}
