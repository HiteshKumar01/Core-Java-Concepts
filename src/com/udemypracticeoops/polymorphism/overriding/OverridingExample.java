package com.udemypracticeoops.polymorphism.overriding;

class Bank{
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

class Test2{
    public static void main(String[] args){
        Bank b=new Bank();
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("In class Bank,Rate of Interest: "+b.getRateOfInterest());
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
