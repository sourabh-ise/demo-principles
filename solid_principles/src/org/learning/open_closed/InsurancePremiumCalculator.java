package org.learning.open_closed;

public class InsurancePremiumCalculator {
    public int calculatePremiumDiscountCalculator(CustomerProfile customer){
        if(customer.isLoyal()){
            return 20;
        }else{
            return 0;
        }
    }
}
