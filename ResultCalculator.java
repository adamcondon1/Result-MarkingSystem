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
public abstract class ResultCalculator {
    //declaring variables
    protected double result;
    
    //constructor
      public ResultCalculator() {    
    }
    
    public ResultCalculator(double result) {
       
        this.result = result;
    }

    //necessary getters and setters made
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    //example of polymorphism @overide 
    @Override
    public String toString() {
        return "ResultCalculator{" + "result=" + result + '}';
    }
    //abstract method computes the result 
    public abstract void computeResult();
    
}

    
    
