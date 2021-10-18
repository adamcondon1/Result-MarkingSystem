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
public class Course implements Serializable{
    //declaring variabes
    private String name;
    
    //setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
    //Constructor
    public Course(String name) {
        this.name = name;
    }
    //equals method implemented 
    public boolean equals (Course course){
    
        return(this.name == (course.name));
    }
    
}
