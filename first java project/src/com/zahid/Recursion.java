package com.zahid;

public class Recursion {

    static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    };

    static  int factorial_itrative (int m){
        if (m == 0 || m == 1){
            return 1;
        }
        else {
            int product = 1 ;
            for (int i = 1 ; i <= m ; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int a = factorial(4);
        System.out.println(a);
        System.out.println("iterative " + factorial_itrative(4));
    }
}
