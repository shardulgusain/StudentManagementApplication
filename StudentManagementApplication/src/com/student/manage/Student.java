/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.manage;

/**
 *
 * @author GUSAIN
 */
public class Student {
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentPhone=" + studentPhone + ", studentCity=" + studentCity + '}';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(int studentId, String studentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }
}
