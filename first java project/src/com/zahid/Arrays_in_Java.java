package com.zahid;

public class Arrays_in_Java {
    public static void main(String[] args) {
        int [] arr_by_first = {2,3,4,5,6,7,8};

        int [] new_snd_arr = new int[arr_by_first.length];

        for (int i = 0; i < arr_by_first.length; i++) {

            new_snd_arr[i] = arr_by_first[i]*100 + 50;

            System.out.println(new_snd_arr[i]);
        }
    }
}
