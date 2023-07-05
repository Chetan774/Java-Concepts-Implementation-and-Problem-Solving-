package com.company;

public class Account {
    public static void main(String[] args) {
     account A1 = new account("Chetan Patil",12345,10000);
     A1.display();
     A1.deposit(1000);
     A1.checkbalance();
     A1.withdraw(1000);
     A1.checkbalance();
    }
    static class account{
        String name;
        long acc_no;
        int amount;

        account(String name,long acc_no,int amount){
            this.name = name;
            this.acc_no = acc_no;
            this.amount = amount;

        }

        void deposit(int amt){
            amount = amount + amt;
            System.out.println("Balance : "+ amount);
        }
        void withdraw(int amt){
            if(amount < amt){
                System.out.println("Insufficient balance");
            }
            else
            {
                amount = amount - amt;
            }
        }
        void display(){
            System.out.println("Name : "+name+"\n"+"Account no : "+ acc_no+"\n"+"Balance : " +amount);
        }
        void  checkbalance(){
            System.out.println("Balance is : "+amount);
        }

    }
}
