/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String MiddleName;
    private String course;
    private String yearLevel;
    private String status;

    private String gender;

    public Student(String id, String firstName, String lastName, String MiddleName, String course, String yearLevel, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.MiddleName = MiddleName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.status = status;
    }

    public int genderValue(String gender, ArrayList<Student> std) {
        int Mcout = 0;
        int Fcout = 0;
        Student stud;
          for (int i = 0; i < std.size(); i++) {
                stud = std.get(i);
                if(stud.getGender().equals("Male")){
                    Mcout++;
                }else{
                    Fcout++;
                }
                
            }
        if (gender.equals("Male")) {
             return Mcout;
        }
        return Fcout;
     
    }

    public boolean isIdDuplicate(String id, ArrayList<Student> std) {
        for (int i = 0; i < std.size(); i++) {
            Student data = std.get(i);
            if (data.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getCourse() {
        return course;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getStatus() {
        return status;
    }

}
