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
    
    public int accNum;
    public String name;
    public String phoneNumber;
    public String address;
    public String meterNumber;
    public String dateMeterSet;
    public Double deposit;
    public boolean refunded;
    public String depRec; //deposit received
    public List<Bill> billList;
    public String meterType;
    
    public int currentMeterReading; // this will be updated with the most recent
                                    // meter reading, once it is input from meter
                                    // reader mode
    
    // customer will have to be an array '
    // we declare length of in the constructor,
    // should be as long as number of cells in row of the spreadsheet
    public Customer() {
        
        
    }
    
    public Customer(int accNum, String name, String phoneNumber, String address, 
            String meterNumber, String meterType, String dateMeterSet, double deposit, 
            boolean refunded, String depRec, List<Bill> billList) {
        
        this.accNum = accNum;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.meterNumber = meterNumber;
        this.dateMeterSet = dateMeterSet;
        this.deposit = deposit;
        this.refunded = refunded;
        this.depRec = depRec;
        this.billList = billList;
        this.meterType = meterType;
        
        
        
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
    
    public String getMeterType() {
        return this.meterType;
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
    
    public double CalculateBill() {
	
	int level1 = 5000;
	int level2 = 5000;
	int level3 = 10000;
	int level4 = 10000;
	
	double price1 = 10.90;
	double price2 = 10.55;
	double price3 = 10;
	double price4 = 9.45;
	double price5 = 8.60;
	
	int galRate = 1000;
	
	double amount1 = (level1*price1)/galRate;
	double amount2 = (level2*price2)/galRate;
	double amount3 = (level3*price3)/galRate;
	double amount4 = (level4*price4)/galRate;
	
	Object[] newestBill = this.getBillList().get(this.getBillList().size()-1).bill;
	int galUsed = (int) newestBill[2];
	double baseCost;
	if (galUsed <= level1) {
		baseCost = (galUsed/galRate)*price1;
	} else if (galUsed <= level1 + level2) {
		baseCost = amount1 + ((galUsed-level1)/galRate)*price2;
	} else if (galUsed <= level1 + level2 + level3) {
		baseCost = amount1 + amount2 + ((galUsed-(level1 + level2))/galRate)*price3;
	} else if (galUsed <= level1 + level2 + level3 + level4) {
		baseCost = amount1 + amount2 + amount3 + ((galUsed-(level1 + level2 + level3))/galRate)*price4;
	} else {
		baseCost = amount1 + amount2 + amount3 + amount4 + ((galUsed-(level1 + level2 + level3 + level4))/galRate)*price5;
	}
	
	double meterA = 31.54;
	double meterB = 45.81;
	double meterF = 76.35;
	double meterK = 244.32;
	double meterN = 488.64;
	double meterR = 763.50;	
	
	if (this.meterType.equals("A") && baseCost < meterA) {
		baseCost = meterA;
	} else if (this.meterType.equals("B") && baseCost < meterB) {
		baseCost = meterB;
	} else if (this.meterType.equals("F") && baseCost < meterF) {
		baseCost = meterF;
	} else if (this.meterType.equals("K") && baseCost < meterK) {
		baseCost = meterK;
	} else if (this.meterType.equals("N") && baseCost < meterN) {
		baseCost = meterN;
	} else if (this.meterType.equals("R") && baseCost < meterR) {
		baseCost = meterR;
	}
	
	double tariffCost;
                  double[] tariffs = {2.45, 1.57};
	
	if (tariffs.length == 0) {
		tariffCost = 0;
	} else {
		tariffCost = 0;
		for (int i = 0; i < tariffs.length; i++) {
			tariffCost += tariffs[i];
		}
	}
	
	double lateFeeCost = (double) newestBill[5];
	
	double finalCost = baseCost + tariffCost + lateFeeCost;
	
	return finalCost;
}
    
    
    
    
}
