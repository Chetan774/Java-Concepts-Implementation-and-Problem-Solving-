package com.company.CollegeAssignment;

public class customer {
    String customerName;
    String customerAddress;
    int customerId;

    customer(String name,String address,int id)
    {
        this.customerName = name;
        this.customerAddress = address;
        this.customerId = id;
    }

    public static void main(String[] args) {
        customer c1 = new customer("Chetan","Pune",1);
        customer c2 = new customer("Mandar","Mumbai",2);

        System.out.println("Customer C1 info : "+"\nName : "+c1.customerName+"\naddress "+c1.customerAddress
                           +"\nId : "+c1.customerId );
        System.out.println();

        System.out.println("Customer C2 info : "+"\nName : "+c2.customerName+"\naddress "+c2.customerAddress
                +"\nId : "+c2.customerId );
    }
}
