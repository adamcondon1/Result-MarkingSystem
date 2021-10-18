/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;

import java.io.Serializable;

/**
 *
 * @author adamc
 */
public class SearchCourse implements Serializable, Comparable<Object> {
    
    //declaring vars
    private String name;
    private String type;
    private float price;

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //constructor
    public SearchCourse(String name, String type, String description, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
   
    //use of sort by implemented 
    public static String SORT_BY;
    
      //constructor 
      public SearchCourse() {
       
    }
      //compare to method implmented for sorting the vars
      public int compareTo(Object o) {
       
        SearchCourse otherSearchCourse = (SearchCourse)o; 
                
        
        if(SORT_BY.equals("name")){
            return getName().compareTo(otherSearchCourse.getName());
        }else if(SORT_BY.equals("type")){
            return getType().compareTo(otherSearchCourse.getType());
        } else if(SORT_BY.equals("price")){
            return getPrice() < otherSearchCourse.getPrice()? -1 : 1;
        }else{
        
        }
        
        return 0;
        
    }

}
