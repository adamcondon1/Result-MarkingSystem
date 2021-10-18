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
//has subclasses use of inheritance 
public class NCI {
    //declare vars
    protected String snum;
    protected String pps;
    protected String address;

    //constructor 
    public NCI(String pps, String address) {
        this.pps = pps;
        this.address = address;
    }
    
    //getters and setters
    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public NCI(String snum) {
        this.snum = snum;
    }
    //assigning values to vars
     public NCI(){
        snum = "";
        address = "";
        pps = "";
     }

    public String getSnum() {
        return snum;
    }

    public void setSnum(String snum) {
        this.snum = snum;
    }
}
