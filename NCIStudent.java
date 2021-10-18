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
public class NCIStudent extends NCI{
    //declare vars
    private String pps;
    private String address;

    //constructor 
    public NCIStudent(String pps, String address, String snum) {
        super(snum);
        this.pps = pps;
        this.address = address;
    }

    NCIStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}

