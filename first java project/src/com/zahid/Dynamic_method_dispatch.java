package com.zahid;

public class Dynamic_method_dispatch {
    static class Phone{
        public void name(){
            System.out.println("Phone");
        }
        public void call(){
            System.out.println("Call From Phone.....");
        }
    }

    static class SmartPhone extends Phone{
        public void name(){
            System.out.println("SmartPhone");
        }
        public void music(){
            System.out.println("Music Playing ....");
        }
    }
    public static void main(String[] args) {
        Phone ZoomPhone = new SmartPhone(); // Refrenced from Phone ( Super class ) and Creating Object ( ZoomPhone ) of SmartPhone ( Sub class )
        ZoomPhone.name();
        ZoomPhone.call();
        // ZoomPhone.music(); // Not Allowed

//        SmartPhone ZoomPhone2 = new Phone // Not allowed
    }
}
