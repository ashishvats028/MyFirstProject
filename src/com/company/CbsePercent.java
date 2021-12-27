package com.company;
import java.util.Scanner;
public class CbsePercent {
    public static void main(String[] args) {
        Scanner TotalMarks = new Scanner(System.in);
        System.out.println("Enter Marks For Subject 1");
        byte a = TotalMarks.nextByte();
        System.out.println("Enter Marks For Subject 2");
        byte b = TotalMarks.nextByte();
        System.out.println("Enter Marks For Subject 3");
        byte c = TotalMarks.nextByte();
        System.out.println("Enter Marks For Subject 4");
        byte d = TotalMarks.nextByte();
        System.out.println("Enter Marks For Subject 5");
        byte e = TotalMarks.nextByte();
        double percent = (double)((a+b+c+d+e)*100)/500;
        System.out.print("Hello Student your percentage is : -");
        System.out.println(percent);
    }
}
