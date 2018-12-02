/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billhub;

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
    
    public int currentMeterReading; // this will be updated with the most recent
                                    // meter reading, once it is input from meter
                                    // reader mode
    
    // customer will have to be an array '
    // we declare length of in the constructor,
    // should be as long as number of cells in row of the spreadsheet
    public Object billHistory[]; 
    
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
    
    public void changeName(String newS) {
        this.name = newS;
    }
    
    public void changePhone(String newS) {
      this.phoneNumber = newS;
    }
    
    public void changeAddress(String newS) {
      this.address = newS;
    }
    
    public String changeMeter(String newS) {
      return this.meterNumber = newS;
    }
    
    public String changeMeterDate(String newS) {
      return this.dateMeterSet = newS;
    }
    
    public double changeDeposit(double newD) {
      return this.deposit = newD;
    }
    
    public String changeDepRec(String newS) {
      return this.depRec = newS;
    }
    
    
}
