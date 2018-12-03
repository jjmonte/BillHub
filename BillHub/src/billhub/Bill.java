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
//    
//    public String readingDate;  // 0
//    public int prevReading;     // 1    
//    public int gallonsUsed;     // 2    
//    public double amntCharged;  // 3
//    public double balFwd;       // 4
//    public double penaltyDisc;  // 5
//    public double total;        // 6
//    public double collected;    // 7
//    public String datePaid;     // 8
//    public double balDue;       // 9   
//    public double credit;       // 10
//    public String remarks;      // 11
//    public String billDate;     // 12
//    
    public Object[] bill;
    
    /*
        bill should be a list of object arrays of length 13 (# of data members)
        
    */
    
   // public List<Bill> billList;
    
    public Bill() {
        bill = new Object[13];
    }
    
    public Bill(String readingDate, int prevReading, int gallonsUsed, 
            double amntCharged, double balFwd, double penaltyDisc, double total,
            double collected, String datePaid, double balDue, double credit,
            String remarks, String billDate) {
        
        bill = new Object[13];
        bill[0] = readingDate;
        bill[1] = prevReading;
        bill[2] = gallonsUsed;
        bill[3] = amntCharged;
        bill[4] = balFwd;
        bill[5] = penaltyDisc;
        bill[6] = total;
        bill[7] = collected;
        bill[8] = datePaid;
        bill[9] = balDue;
        bill[10] = credit;
        bill[11] = remarks;
        bill[12] = billDate;
        
    }
    
    public Bill(String readingDate, int prevReading, int gallonsUsed, 
            double amntCharged, double balFwd, double penaltyDisc, double total,
            double collected, String datePaid, double balDue, double credit, String billDate) {
        
        bill = new Object[13];
        bill[0] = readingDate;
        bill[1] = prevReading;
        bill[2] = gallonsUsed;
        bill[3] = amntCharged;
        bill[4] = balFwd;
        bill[5] = penaltyDisc;
        bill[6] = total;
        bill[7] = collected;
        bill[8] = datePaid;
        bill[9] = balDue;
        bill[10] = credit;
        bill[12] = billDate;
        
    }
    
    
    
}
