package com.company.methodOverinding;

public class BankMain {
    public static void main(String[] args) {
        sbi s = new sbi();
        hdfc h = new hdfc();
        icici c = new icici();


        System.out.println("SBI rate of interest is : "+ s.getRateOfInterest()+ " %");
        System.out.println("hdfc rate of interest is : "+ h.getRateOfInterest()+" %");
        System.out.println("icici rate of interest is : "+ c.getRateOfInterest()+" %");
    }
}
class bank{
    int getRateOfInterest(){
        return 0;
    }
}
class sbi extends bank{
    int getRateOfInterest(){
        return 7;
    }
}
class hdfc extends bank{
    int getRateOfInterest(){
        return 8;
    }
}
class icici extends bank{
    int getRateOfInterest(){
        return 9;
    }
}
