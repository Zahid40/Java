package com.zahid;

public class practice_3 {

    //q1
    static void Table(int n){
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(n +" X "+i+" = "+(n*i) );
        }
    }

    //q2
    static void Star_pattern1(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }

    //q3
    static int Sum_of_natural (int n){
        if (n ==1){
            return 1;
        }
        else {
            return n + Sum_of_natural(n - 1);
        }
    }

    //q4
    static void Star_pattern2(int n){
        for (int i = n ; i > 0 ; i--){
            for (int j = i ; j > 0 ; j--){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }

    //q5
    static int fibbonacci(int n){
        if (n == 1 || n == 2 ){
            return n-1;
        }
        else {
            return fibbonacci(n-1) + fibbonacci(n-2);
        }
    }

    static int sum_of_argnum ( int ...num){
        int res = 0;
        for (int a : num){
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
        //q1
        //Table(7);

        //q2
        //Star_pattern1(7);

        //q3
        //int s = Sum_of_natural(20);
        //System.out.println(s);

        //q4
        //Star_pattern2(10);

        //q5
        //System.out.println(fibbonacci(10));

        //q6
        System.out.println(sum_of_argnum(4,6,7,2,4));
    }
}
