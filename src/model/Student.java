  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String MiddleName;
    private String course;
    private String yearLevel;
    private String status;

    public Student(String id, String firstName, String lastName, String MiddleName, String course, String yearLevel, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.MiddleName = MiddleName;
        this.course = course;
        this.yearLevel = yearLevel;
        this.status = status;
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
