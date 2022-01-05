package com.company;

public class SumNEven {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n<=3) {
            sum = sum + (2*n);
            n++;
        }
        System.out.println(sum);
        }
    }
