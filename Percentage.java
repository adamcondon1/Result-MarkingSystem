/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markingsystem;

/**
 *
 * @author adamc
 */
//use of inheritance
public class Percentage extends ResultCalculator{
    //declaring variabes
    double result;
    
    
    public Percentage(double result) {
        //inheritance with super keyword
        super(result);
        this.result = result;
    }
    //necessary getters and setters made
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    //the abstract method converts the marks they got into a percentage 
    //@Override use of polymorphism
    @Override
    public void computeResult() {
        result = result * 1.0; 
    }  
}
