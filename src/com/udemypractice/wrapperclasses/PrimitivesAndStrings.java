package wrapperclasses;

public class PrimitivesAndStrings {
    public static void main(String[] args){
        byte a=100;
        String s=Byte.toString(a);
        System.out.println(s);

        byte b=Byte.parseByte(s);
        System.out.println(b);
    }
}
