package com.company;

import java.util.Scanner;

public class CovertMiles {
    public static void main(String[] args) {
        System.out.println("Enter Km To Convert");
        Scanner Km = new Scanner(System.in);
        float b = Km.nextFloat();
        double mile = b*0.6124;
        System.out.println("This is the miles: - ");
        System.out.println(mile);
    }
}
