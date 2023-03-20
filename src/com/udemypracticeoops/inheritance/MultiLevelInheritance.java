package com.udemypracticeoops.inheritance;

class Aa{
    void animal(){
        System.out.println("is animal");
    }
}
class Bb extends Aa{
    void species(){
        System.out.println("of some species");
    }
}
class Cc extends Bb{
    void dog(){
        System.out.println("Dog");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Cc ob=new Cc();
        ob.dog();
        ob.animal();
        ob.species();

    }
}
