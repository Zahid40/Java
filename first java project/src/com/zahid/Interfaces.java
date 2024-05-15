package com.zahid;

public class Interfaces {
    interface gps{
        void location();
    }

    interface Camera{
        void clickPhoto();
        default void recordVideo(){
            System.out.println("Recording Video ......");
        }
    }

    interface mediaplayer{
        void playMusic();
    }

    static class Phone{
        public void call(String name){
            System.out.println("Calling " + name + " ......");
        }
    }

    static class SmartPhone extends Phone implements gps , Camera , mediaplayer {
        @Override
        public void location(){
            System.out.println("Your Location is india");
        }

        @Override
        public void clickPhoto() {
            System.out.println("Smile Camera Action .");
        }

        @Override
        public void playMusic(){
            System.out.println("Play Music");
        }



    }
    public static void main(String[] args) {
        SmartPhone Motorola = new SmartPhone();
        Motorola.call("Zahid");
        Motorola.location();
        Motorola.recordVideo();
    }
}
