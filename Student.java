/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;
import java.io.*;
/**
 *
 * @author adamc
 */
public class Student implements Serializable{
    //declaring variabes
    private String name;
    private String surname;
    private Course course;
    private int result;

    public Student(int result) {
        this.result = result;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
//all necessary setters and getters and constructor generated 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    //constructor
    public Student(String name, String surname, Course course, int result) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.result = result;
    }

}
