package com.company;

public class WhileFactorial {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while(n!=1){
          i = i * n;
          n--;
        }
        System.out.println(i);
    }
}
