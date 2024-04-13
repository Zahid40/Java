package com.zahid;
import java.util.Scanner;
public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Entring student marks
        String sub1 = "Mathes";
        String sub2 = "Physics";
        String sub3 = "Chemistry";

        System.out.println("Enter marks for Subject " + sub1 + " : ");
        int mark1 = sc.nextInt();
        System.out.println("Enter marks for Subject " + sub2 + " : ");
        int mark2 = sc.nextInt();
        System.out.println("Enter marks for Subject " + sub3 + " : ");
        int mark3 = sc.nextInt();

        int total_percentage = (mark1 + mark2 + mark3)/3;

        int result ;

        if (total_percentage > 40 && mark1 > 33 && mark2 > 33 && mark3 > 33){
            result = 1;
        }
        else {
            result = 0;
        }

        switch (result){
            case 1 -> System.out.println("Passed !!");
            case 0 -> System.out.println("Failed !!");
        }



    }
}
