package com.zahid;

public class practice_4 {
    //Question 1 :
    public static class Circle{
        protected float r ;
        Circle(){
            this.r = 0;
            System.out.println("Non params Circle constructor");
        }
        Circle(float r){
            this.r = r;
        }

        public double areaofcircle(){
          return  (Math.PI*this.r*this.r);
        }
    }

    public static class Cylinder extends Circle{
        protected float h;

        Cylinder(){
            super();
            System.out.println("Non params Cylinder constructor");
        }
        Cylinder(float r , float h){
            super(r);
            this.h = h;
        }
        public double areaofcylinder(){
            return 2*Math.PI*this.r*this.h + 2*Math.PI*this.r*this.r;
        }
        public double volumeofcylinder(){
            return Math.PI*this.r*this.r*this.h;
        }
    }
    public static void main(String[] args) {
        //Circle ring = new Circle(5);
        //System.out.println( "The area of circle is " + ring.areaofcircle() + " meter Square");

        Cylinder roller = new Cylinder(5,10);
        System.out.println("The area of Cylinder is " + roller.areaofcylinder() + " meter Square");
        System.out.println("Area of Top/Bottom Circle is " + roller.areaofcircle() + " meters Square");
        System.out.println("Volume of Cylinder " + roller.volumeofcylinder() + " meters cube");

    }
}
