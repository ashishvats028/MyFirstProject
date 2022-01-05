package com.company;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int option = 0;
        int comp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Option" + "\n" + "0.Rock\n" + "1.Paper\n" + "2.Scissor");
        option = sc.nextInt();
        Random rn = new Random();
        comp = rn.nextInt(3);
        System.out.println("You selected :" + option);
        System.out.println("Computer Option :" + comp);
        if (option == 0 && comp == 1 || option == 0 && comp == 2) {
            System.out.println("Yeahhh! You Won");
        } else if (option == 1 && comp == 2 || option == 1 && comp == 0) {
            System.out.println("Sorry! You Loose");
        } else if (option == 2 && comp == 0) {
            System.out.println("Sorry! You Loose");
        } else if (option == 2 && comp == 1) {
            System.out.println("Yeahhh! You Won");
        }
        else{
            System.out.println("Its a Tie");
        }
    }
}
