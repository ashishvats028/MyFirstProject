package com.company;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        float totalTax = 0;
        int salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Total Income");
        salary = sc.nextInt();
        if(salary>250000 && salary<=500000){
            totalTax = (salary*5)/100f;
            System.out.println("TotalTax : " +totalTax);
        }
        else if(salary>500000 && salary<=1000000){
            totalTax = (salary*20) / 100f;
            System.out.println("TotalTax : " +totalTax);
        }
        else if(salary>1000000){
            totalTax = (salary*30) /100f;
            System.out.println("TotalTax : " +totalTax);
        }
        else {
            System.out.println("No Tax shit for you");
        }
    }
}














