package com.zahid;

public class Constructor {

    static class animal {
        private int legs;
        public animal(int n){
            this.legs = n;
            System.out.println("the animal has " + this.legs + " legs");
        }
    }

    static class Cat extends animal {
        String name ;
        public Cat(int n , String name) {
            super(n);
            System.out.println("Cat name is " + this.name);
        }
    }
    public static void main(String[] args) {
       animal dog = new animal(4);

       Cat tom = new Cat(4 , "tom");

    }
}
