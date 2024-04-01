package com.zahid;
import java.util.Scanner;

public class input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius :");
        int r = sc.nextInt();
        float a = (float) (3.14*r*r);
        float v = (float)(4/3)*((float) 22 /7)*r*r*r;
        System.out.println("The area of circle is = " + a);
        System.out.println("Volume = " + v);


    }
}
