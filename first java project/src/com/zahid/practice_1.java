package com.zahid;
import java.util.Scanner;

public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter secrate ( name ) = ");
        String k = sc.nextLine();
        String code = k + 56 + "Alak";
        System.out.println("Your code is " + code);


    }
}
