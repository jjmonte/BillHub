/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billhub;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Lecture Nappers
 */
public class BillHub {

    public static String[] userAccounts = new String[4];
    public static String[] passwords = new String[4];
    public static Customer[] database = new Customer[30];
    
    public BillHub() {
        
        BillHub.userAccounts[0] = "Secretary";
        BillHub.userAccounts[1] = "Assistant";
        BillHub.userAccounts[2] = "Meter Reader";
        BillHub.userAccounts[3] = "President";
        for (int i = 0; i < 4; i++) {
            passwords[i] = "0000";
        }
        
         // hardcode customers
        
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
         
        List<Bill> billList1 = new ArrayList<>(); // billList for 1st sample customer
        
        billList1.add(new Bill("15-Nov", 123456, 4500, 44.50, 0.00,  0.00,  44.50, 
                44.50, "12/12/2017",  44.50, 0.00, "254", "12/13/2017"));
        
        this.database[0] = new Customer("1", "Sally Smith", "304-588-1234", "188 Temple Dr.\n" +
        "Vallley Falls, WV, 25443", "12548774", "Mar-10", 75.00, true, "02/18/2017", billList1);
        
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. open UI with login screen first
        *  2. after login display screen with
        *     options: view customer database,
        *     modify billing (add tariffs/change rate),
        *     view statistics
        *     
        *     All information on customers + add/remove customers
        *     will be on the "view customer database" window.
        *    
        *     we need to make sure each function has a method somewhere
        *     and make sure to check for user type to see if they have access
        *
        *     we can store the user accounts here in main method
        *     
        *     the customer database will be an array storing the 6 sample
        *     customers she gave us
        */
        
        BillHub system = new BillHub();
        
        new billHubLogin().setVisible(true);
        
       
    }
    
}
