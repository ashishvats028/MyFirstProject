package com.company;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int Marks1,Marks2,Marks3;
        Scanner sc = new Scanner(System.in);
        Marks1=sc.nextInt();
        Marks2 = sc.nextInt();
        Marks3=sc.nextInt();
        float avg = (Marks1+Marks2+Marks3)/3.0f;
        System.out.println("Your Percentage is :" + avg);
        if(avg>=40 && Marks1>=33 && Marks2>=33 && Marks3>=33) {
            System.out.println("Yeah! You're Pass");
        }
        else{
            System.out.println("OOps! You're Fail");

        }
    }
}
