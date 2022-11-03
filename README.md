package com;

import java.util.Scanner;
public class Main {
       
    public static void main(String args[] )  
    {  
        int balance = 44345, withdraw, deposit;  
        int pin = 2130;
          
          
        Scanner sc = new Scanner(System.in);  
       
     
          System.out.println("Welcome to DOrSU banking System");
          System.out.print("Please enter your 4 digit pin:");
         int gh = sc.nextInt();
         while (pin != gh) {
         System.out.println("");
         System.out.println("Sorry there is no account link to this pin");
         System.out.print("Please try again: ");
         gh = sc.nextInt();
           }
         System.out.println("");
         
      while(true)  
        {   System.out.println("Welcome acount 37282 ");
            System.out.println("To start select from the following transaction");
            System.out.println("1 View balance");  
            System.out.println("2 Withdraw");  
            System.out.println("3 Deposit");  
            System.out.println("4 EXIT");  
            System.out.print("Input:"); 
              
            int choice = sc.nextInt();  
            System.out.println("");
            switch(choice)  
            {  
        case 1:  
        System.out.println("balance is :" + balance);
        System.out.println("");
        break;
        
        case 2:
        System.out.println("Your current balance is " + balance);
        System.out.println("Enter amount to be withdrawn: ");
        withdraw = sc.nextInt();
        if (balance >= withdraw){
          balance = balance - withdraw;
          System.out.println("Thank you!!");
          System.out.println("");
       
        break;}
        while (balance >= 100){
        System.out.println("Your current balance is " + balance);
          System.out.println("Atleast leave a minimum amount of 100, please try again");
          int ab = sc.nextInt();
          
        }
          
        case 3:
          System.out.print("Enter amount to be deposited:");
          deposit = sc.nextInt();
          balance = balance + deposit;
          System.out.println("Your money has been successfully deposited");
          System.out.println("");

        break;
        
        case 4:
        System.exit(0);  
            }
        }  
    }  
}  
