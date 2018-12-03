/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billhub;

import java.util.List;

/**
 *
 * @author jon
 */
public class Customer {
    
    public String name;
    public String phoneNumber;
    public String address;
    public String meterNumber;
    public String dateMeterSet;
    public double deposit;
    public boolean refunded;
    public String depRec; //deposit received
    public List<Bill> billList;
    
    public int currentMeterReading; // this will be updated with the most recent
                                    // meter reading, once it is input from meter
                                    // reader mode
    
    // customer will have to be an array '
    // we declare length of in the constructor,
    // should be as long as number of cells in row of the spreadsheet
    public Customer() {
        
        
    }
    
    public Customer(String name, String phoneNumber, String address, 
            String meterNumber, String dateMeterSet, double deposit, 
            boolean refunded, String depRec, List<Bill> billList) {
        
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.meterNumber = meterNumber;
        this.dateMeterSet = dateMeterSet;
        this.deposit = deposit;
        this.refunded = refunded;
        this.depRec = depRec;
        this.billList = billList;
        
    }
    
    public String getName() {
      return this.name;
    }
    
    public String getPhone() {
      return this.phoneNumber;
    }
    
    public String getAddress() {
      return this.address;
    }
    
    public String getMeter() {
      return this.meterNumber;
    }
    
    public String getMeterDate() {
      return this.dateMeterSet;
    }
    
    public double getDeposit() {
      return this.deposit;
    }
    
    public String getDepRec() {
      return this.depRec;
    }
    
    public List<Bill> getBillList() {
        return this.billList;
    }
    
    public void setName(String newS) {
        this.name = newS;
    }
    
    public void setPhone(String newS) {
      this.phoneNumber = newS;
    }
    
    public void setAddress(String newS) {
      this.address = newS;
    }
    
    public void setMeter(String newS) {
      this.meterNumber = newS;
    }
    
    public void setMeterDate(String newS) {
      this.dateMeterSet = newS;
    }
    
    public void setDeposit(double newD) {
      this.deposit = newD;
    }
    
    public void setDepRec(String newS) {
      this.depRec = newS;
    }
    
    
    
    
    
    
}
