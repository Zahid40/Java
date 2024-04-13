package com.zahid;
import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number : ");
        int a = sc.nextInt();

        //if-else-if

        if (a == 5){
            System.out.println("ye tho vahi hae !!");
        } else if (a == 7) {
            System.out.println("Creation wali");
        }
        else{
            System.out.println("others");
        }

        //switch-case (enhanced) ( Breake noy required )
        switch (a){
            case 5 -> {
                System.out.println("Ye vahi hae !! Switch se bhi");
                System.out.println("2 Outputs ke liye aaise");
            }
            case 7 -> System.out.println("creation wali !! switch se bhi");
            default -> System.out.println("others again with switch");
        }
    }
}
