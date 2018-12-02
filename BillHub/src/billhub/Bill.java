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
public class Bill {
    
    // this class will be where the customer's bill (history with dates of bill
    // etc.) is located. this will be an object within the customer class
    
    // each bill object
    
    public String readingDate;  // 
    public int prevReading;
    public int gallonsUsed;
    public double amntCharged;
    public double balFwd;
    public double penaltyDisc;
    public double total;
    public double collected;
    public String datePaid;
    public double balDue;
    public double credit;
    public String remarks;
    public String billDate;
    
    public Object[] bill;
    
    /*
        bill should be a list of object arrays of length 13 (# of data members)
        
    */
    
    public List<Bill> billList;
    
    public Bill() {
        bill = new Object[13];
    }
    
    public Bill(String readingDate, int prevReading, int gallonsUsed, 
            double amntCharged, double balFwd, double penaltyDisc, double total,
            double collected, String datePaid, double balDue, double credit,
            String remarks) {
        
        
        
    }
    
     public Bill(String readingDate, int prevReading, int gallonsUsed, 
            double amntCharged, double balFwd, double penaltyDisc, double total,
            double collected, String datePaid, double balDue, double credit) {
        
        
        
    }
}
