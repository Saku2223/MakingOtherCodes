package com.company;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("What is your number");
        int number = input.nextInt();

        if ((number % 2) == 0) {
            System.out.println("This is an even number");
        }

        else {
            System.out.println("This number is odd");
        }
       
    }
}
