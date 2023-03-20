package com.udemypractice.nonstaticmembers;

public class CreateReferenceInsideStaticMethod {

    static CreateReferenceInsideStaticMethod obj=new CreateReferenceInsideStaticMethod();

    static{
        System.out.println(CreateReferenceInsideStaticMethod.obj);
        CreateReferenceInsideStaticMethod.obj=CreateReferenceInsideStaticMethod.init();
    }
    public static void main(String[] args){
        System.out.println(CreateReferenceInsideStaticMethod.obj);
    }
    static CreateReferenceInsideStaticMethod init(){
        return new CreateReferenceInsideStaticMethod();
    }
}
