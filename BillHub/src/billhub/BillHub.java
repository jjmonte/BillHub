/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billhub;

/**
 *
 * @author The Lecture Nappers
 */
public class BillHub {

    public static String[] userAccounts = new String[4];
    public static String[] passwords = new String[4];
    
    public BillHub() {
        
        BillHub.userAccounts[0] = "Secretary";
        BillHub.userAccounts[1] = "Assistant";
        BillHub.userAccounts[2] = "Meter Reader";
        BillHub.userAccounts[3] = "President";
        for (int i = 0; i < 4; i++) {
            passwords[i] = "0000";
        }
    
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
