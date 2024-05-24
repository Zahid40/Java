package com.zahid;
import java.util.Scanner;

public class Searching {
     public static class Linear_search{
        private int number ;
        private int [] arr;
        Linear_search ( int n , int [] arr){
            this.number = n;
            this.arr = arr;
        }
        public void Search(){
            boolean flag = true;
            int i = 0;
            try {
                while (flag) {
                    if (this.number == this.arr[i]) {
                        System.out.println("Number " + this.number + " found at index " + i);
                        flag = false;
                    }
                    i++;
                }
            }
            catch (Exception e){
                System.out.println("Number Not Found");
            }
         }


    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n ;
        int [] marks = {1,23,34,67,86,98,4,5,67};
        System.out.print("Enter Your Number Searched for = ");
        n = sc.nextInt();
        Linear_search zser = new Linear_search(n , marks);
        zser.Search();

    }
}
