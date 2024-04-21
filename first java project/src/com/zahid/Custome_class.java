package com.zahid;

class Coder{
    private int id;
    private String name;
    public void printdetails(){
        System.out.println("My id is " + id + " and my name is " + name);
    }
    public void setdetails(int cid , String cname){
        this.id = cid;
        name = cname;
        System.out.println("id and name set succsessfully !!!");
    }
}

public class Custome_class {

    public static void main(String[] args) {
        Coder zahid = new Coder(); //Instantiating a new coder object

        zahid.setdetails(234 , "Zahid walker");

        zahid.printdetails();

    }
}
